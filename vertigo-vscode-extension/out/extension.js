'use strict';
Object.defineProperty(exports, "__esModule", { value: true });
exports.activate = void 0;
const path = require("path");
const os = require("os");
const vscode_jsonrpc_1 = require("vscode-jsonrpc");
const vscode_1 = require("vscode");
const vscode_languageclient_1 = require("vscode-languageclient");
const vertigoStudioTaskProvider_1 = require("./vertigoStudioTaskProvider");
function activate(context) {
    // The server is a locally installed in src/mydsl
    let launcher = os.platform() === 'win32' ? 'vertigodsl-standalone.bat' : 'vertigodsl-standalone';
    let script = context.asAbsolutePath(path.join('src', 'vertigodsl', 'bin', launcher));
    let serverOptions = {
        run: { command: script },
        debug: { command: script, args: [], options: { env: createDebugEnv() } }
    };
    let clientOptions = {
        documentSelector: ['vertigo'],
        synchronize: {
            fileEvents: vscode_1.workspace.createFileSystemWatcher('**/src/*')
        }
    };
    // Create the language client and start the client.
    let lc = new vscode_languageclient_1.LanguageClient('Vertigo Xtext LS', serverOptions, clientOptions);
    // enable tracing (.Off, .Messages, Verbose)
    lc.trace = vscode_jsonrpc_1.Trace.Verbose;
    let disposable = lc.start();
    // Push the disposable to the context's subscriptions so that the 
    // client can be deactivated on extension deactivation
    context.subscriptions.push(disposable);
    let launcherStudio = os.platform() === 'win32' ? 'vertigo-studio-standalone.bat' : 'vertigo-studio-standalone';
    let executableStudio = context.asAbsolutePath(path.join('src', 'vertigo-studio', 'bin', launcherStudio));
    vscode_1.tasks.registerTaskProvider("vertigo-studio", new vertigoStudioTaskProvider_1.VertigoStudioTaskProvider(executableStudio));
}
exports.activate = activate;
function createDebugEnv() {
    return Object.assign({
        JAVA_OPTS: "-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n,quiet=y"
    }, process.env);
}
//# sourceMappingURL=extension.js.map