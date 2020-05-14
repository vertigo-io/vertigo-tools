'use strict';
Object.defineProperty(exports, "__esModule", { value: true });
exports.activate = void 0;
const path = require("path");
const os = require("os");
const child_process = require("child_process");
const vscode_jsonrpc_1 = require("vscode-jsonrpc");
const vscode_1 = require("vscode");
const vscode_languageclient_1 = require("vscode-languageclient");
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
    let studioOutputChannel = vscode_1.window.createOutputChannel("Vertigo Studio");
    context.subscriptions.push(studioOutputChannel);
    var disposable2 = vscode_1.commands.registerCommand("vertigo.studio.cleanGen", async (studioConfigPath) => {
        studioOutputChannel.appendLine("Launching Vertigo-Studio with config file : " + studioConfigPath);
        let launcher = os.platform() === 'win32' ? 'vertigo-studio-standalone.bat' : 'vertigo-studio-standalone';
        studioOutputChannel.show();
        let executable = context.asAbsolutePath(path.join('src', 'vertigo-studio', 'bin', launcher));
        child_process.exec(executable + " " + studioConfigPath, (error, stdout, stderr) => {
            if (error) {
                studioOutputChannel.append(`error: ${error.message}`);
                return;
            }
            if (stderr) {
                studioOutputChannel.append(`stderr: ${stderr}`);
                return;
            }
            studioOutputChannel.append(`stdout: ${stdout}`);
        });
        /*
        let studio = child_process.spawn(executable, [studioConfigPath.s], {});
        
        studio.stdout.on("data", (data) => {
            studioOutputChannel.append(data);
        });
        studio.stderr.on("data", (data) => {
            studioOutputChannel.append(data);
        });
        */
    });
    context.subscriptions.push(disposable2);
}
exports.activate = activate;
function createDebugEnv() {
    return Object.assign({
        JAVA_OPTS: "-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n,quiet=y"
    }, process.env);
}
//# sourceMappingURL=extension.js.map