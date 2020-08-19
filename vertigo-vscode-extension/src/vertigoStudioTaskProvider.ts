
import * as fs from 'fs';
import * as vscode from 'vscode';

export class VertigoStudioTaskProvider implements vscode.TaskProvider {

	private vertigoStudioPromise: Thenable<vscode.Task[]> | undefined = undefined;
    private studioLauncher: string

	constructor(studioLauncher: string) {
        this.studioLauncher = studioLauncher;
	}

	public provideTasks(): Thenable<vscode.Task[]> | undefined {
		if (!this.vertigoStudioPromise) {
			this.vertigoStudioPromise = getVertigoStudioTasks(this.studioLauncher);
		}
		return this.vertigoStudioPromise;
	}

	public resolveTask(_task: vscode.Task): vscode.Task | undefined {
        const task = _task.definition.task;
        const file = _task.definition.file;
		if (task && file) {
			// resolveTask requires that the same definition object be used.
			const definition: StudioTaskDefinition = <any>_task.definition;
			return new vscode.Task(definition, definition.task, 'vertigo-studio', new vscode.ShellExecution(this.studioLauncher + ' ' +task+' ' + file));
		}
		return undefined;
	}
}

function exists(file: string): Promise<boolean> {
	return new Promise<boolean>((resolve, _reject) => {
		fs.exists(file, (value) => {
			resolve(value);
		});
	});
}

interface StudioTaskDefinition extends vscode.TaskDefinition {
	/**
	 * The task name
	 */
	task: string;

	/**
	 * The studio-file containing the config
	 */
	file: string;
}

async function getVertigoStudioTasks(studioLauncher: string): Promise<vscode.Task[]> {
	const workspaceFolders = vscode.workspace.workspaceFolders;
	const result: vscode.Task[] = [];
	if (!workspaceFolders || workspaceFolders.length === 0) {
		return result;
	}
	for (const workspaceFolder of workspaceFolders) {
		const folderUri = workspaceFolder.uri;
		if (!folderUri.fsPath) {
			continue;
		}
		const studioConfigFileUri = vscode.Uri.joinPath(folderUri, 'studio-config.yaml');
		if (!await exists(studioConfigFileUri.fsPath)) {
			continue;
		}
		
		result.push(createVsCodeTask('clean', workspaceFolder, studioLauncher, studioConfigFileUri));
		result.push(createVsCodeTask('generate', workspaceFolder, studioLauncher, studioConfigFileUri));
		result.push(createVsCodeTask('watch', workspaceFolder, studioLauncher, studioConfigFileUri));
		result.push(createVsCodeTask('clean_watch', workspaceFolder, studioLauncher, studioConfigFileUri));
        
	}
	return result;
}


function createVsCodeTask(goal : string, workspaceFolder: vscode.WorkspaceFolder, studioLauncher: string, studioConfigFileUri: vscode.Uri):vscode.Task {
	const taskKind: StudioTaskDefinition = {
		type: 'vertigo-studio',
		task: goal,
		file: studioConfigFileUri.toString()
	};
	return new vscode.Task(taskKind, workspaceFolder,workspaceFolder.name + ' - ' + goal, 'vertigo-studio', new vscode.ShellExecution(studioLauncher, [goal, studioConfigFileUri.toString()]));
}