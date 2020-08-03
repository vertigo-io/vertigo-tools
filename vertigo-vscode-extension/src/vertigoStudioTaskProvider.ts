
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
		const studioConfigFileUri = vscode.Uri.joinPath(folderUri, 'studio-config.json');
		if (!await exists(studioConfigFileUri.fsPath)) {
			continue;
        }

        const generateKind: StudioTaskDefinition = {
            type: 'vertigo-studio',
            task: 'generate',
            file: studioConfigFileUri.toString()
        };
    
        result.push(new vscode.Task(generateKind, workspaceFolder, workspaceFolder.name + ' - generate', 'vertigo-studio', new vscode.ShellExecution(studioLauncher, ['generate', studioConfigFileUri.toString()])));

        const watchKind: StudioTaskDefinition = {
            type: 'vertigo-studio',
            task: 'watch',
            file: studioConfigFileUri.toString()
        };
        result.push(new vscode.Task(generateKind, workspaceFolder,workspaceFolder.name + ' - watch', 'vertigo-studio', new vscode.ShellExecution(studioLauncher, ['watch', studioConfigFileUri.toString()])));
        
	}
	return result;
}