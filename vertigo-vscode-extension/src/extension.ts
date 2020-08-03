'use strict';

import * as path from 'path';
import * as os from 'os';

import {Trace} from 'vscode-jsonrpc';
import { tasks,  workspace, ExtensionContext} from 'vscode';
import { LanguageClient, LanguageClientOptions, ServerOptions } from 'vscode-languageclient';

import { VertigoStudioTaskProvider } from './vertigoStudioTaskProvider';


export function activate(context: ExtensionContext) {
    // The server is a locally installed in src/mydsl
    let launcher = os.platform() === 'win32' ? 'vertigodsl-standalone.bat' : 'vertigodsl-standalone';
    let script = context.asAbsolutePath(path.join('src', 'vertigodsl', 'bin', launcher));

    let serverOptions: ServerOptions = {
        run : { command: script },
        debug: { command: script, args: [], options: { env: createDebugEnv() } }
    };
    
    let clientOptions: LanguageClientOptions = {
        documentSelector: ['vertigo'],
        synchronize: {
            fileEvents: workspace.createFileSystemWatcher('**/src/*')
        }
    };
    
    // Create the language client and start the client.
    let lc = new LanguageClient('Vertigo Xtext LS', serverOptions, clientOptions);
    // enable tracing (.Off, .Messages, Verbose)
    lc.trace = Trace.Verbose;
    let disposable = lc.start();
    
    // Push the disposable to the context's subscriptions so that the 
    // client can be deactivated on extension deactivation
    context.subscriptions.push(disposable);

    let launcherStudio = os.platform() === 'win32' ? 'vertigo-studio-standalone.bat' : 'vertigo-studio-standalone';
    let executableStudio = context.asAbsolutePath(path.join('src', 'vertigo-studio', 'bin', launcherStudio));
    
    tasks.registerTaskProvider("vertigo-studio", new VertigoStudioTaskProvider(executableStudio));

   
   
}

function createDebugEnv() {
    return Object.assign({
        JAVA_OPTS:"-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n,quiet=y"
    }, process.env)
}