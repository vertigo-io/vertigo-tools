"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.VertigoStudioTaskProvider = void 0;
const fs = require("fs");
const vscode = require("vscode");
class VertigoStudioTaskProvider {
    constructor(studioLauncher) {
        this.vertigoStudioPromise = undefined;
        this.studioLauncher = studioLauncher;
    }
    provideTasks() {
        if (!this.vertigoStudioPromise) {
            this.vertigoStudioPromise = getVertigoStudioTasks(this.studioLauncher);
        }
        return this.vertigoStudioPromise;
    }
    resolveTask(_task) {
        const task = _task.definition.task;
        const file = _task.definition.file;
        if (task && file) {
            // resolveTask requires that the same definition object be used.
            const definition = _task.definition;
            return new vscode.Task(definition, definition.task, 'vertigo-studio', new vscode.ShellExecution(this.studioLauncher + ' ' + task + ' ' + file));
        }
        return undefined;
    }
}
exports.VertigoStudioTaskProvider = VertigoStudioTaskProvider;
function exists(file) {
    return new Promise((resolve, _reject) => {
        fs.exists(file, (value) => {
            resolve(value);
        });
    });
}
async function getVertigoStudioTasks(studioLauncher) {
    const workspaceFolders = vscode.workspace.workspaceFolders;
    const result = [];
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
function createVsCodeTask(goal, workspaceFolder, studioLauncher, studioConfigFileUri) {
    const taskKind = {
        type: 'vertigo-studio',
        task: goal,
        file: studioConfigFileUri.toString()
    };
    return new vscode.Task(taskKind, workspaceFolder, workspaceFolder.name + ' - ' + goal, 'vertigo-studio', new vscode.ShellExecution(studioLauncher, [goal, studioConfigFileUri.toString()]));
}
//# sourceMappingURL=vertigoStudioTaskProvider.js.map