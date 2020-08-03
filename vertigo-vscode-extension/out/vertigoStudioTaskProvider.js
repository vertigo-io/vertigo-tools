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
        const studioConfigFileUri = vscode.Uri.joinPath(folderUri, 'studio-config.json');
        if (!await exists(studioConfigFileUri.fsPath)) {
            continue;
        }
        const generateKind = {
            type: 'vertigo-studio',
            task: 'generate',
            file: studioConfigFileUri.toString()
        };
        result.push(new vscode.Task(generateKind, workspaceFolder, workspaceFolder.name + ' - generate', 'vertigo-studio', new vscode.ShellExecution(studioLauncher, ['generate', studioConfigFileUri.toString()])));
        const watchKind = {
            type: 'vertigo-studio',
            task: 'watch',
            file: studioConfigFileUri.toString()
        };
        result.push(new vscode.Task(generateKind, workspaceFolder, workspaceFolder.name + ' - watch', 'vertigo-studio', new vscode.ShellExecution(studioLauncher, ['watch', studioConfigFileUri.toString()])));
    }
    return result;
}
//# sourceMappingURL=vertigoStudioTaskProvider.js.map