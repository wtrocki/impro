/*******************************************************************************
 * Copyright (c) 2006, 2011 Graz University of Technology,
 * Institute of Theoretical and Computational Physics (ITPCP) 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christopher Albert (ITPCP) - initial API and implementation
 *******************************************************************************/
package com.matlab.eclipse.mconsole.win32.impl;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;

import com.matlab.eclipse.mconsole.MConsolePlugin;
import com.matlab.eclipse.mconsole.matlab.MatlabCommunicationException;
import com.matlab.eclipse.mconsole.matlab.MatlabInterpreter;
import com.matlab.eclipse.mconsole.matlab.MatlabNotStartedException;
import com.matlab.eclipse.mconsole.matlab.impl.XMLMatlabInterpreter;
import com.matlab.eclipse.mconsole.views.MatlabConsoleView;
import com.matlab.eclipse.mconsole.win32.MatlabCOMWrapper;

public class COMMatlabInterpreter extends XMLMatlabInterpreter implements MatlabInterpreter {
	MatlabCOMWrapper comwrapper = null;
	String consoleOutput;

	public boolean startLocal() {
		comwrapper = new JacobMatlabCOMWrapper();
		return true;
	}

	public void stop() {
		if (comwrapper != null) {
			comwrapper.quit();
			comwrapper = null;
		}
	}

	public void evalInConsole(String command, boolean addToCommandHistory)
			throws MatlabCommunicationException, MatlabNotStartedException {
		MConsolePlugin.getDefault().getWorkbench().getDisplay().syncExec(
				new Runnable() {
					public void run() {
						try {
							MConsolePlugin
									.getDefault()
									.getWorkbench()
									.getActiveWorkbenchWindow()
									.getActivePage()
									.showView(
											"com.matlab.eclipse.mconsole.views.MatlabConsoleView");

						} catch (Exception e) {

						}
					}
				});
		MatlabConsoleView.getDefault().run(command, null, addToCommandHistory, true);
	}

	public void sendBreak() throws IOException {
		stop();
		try {
			start();
		} catch (CoreException e) {
			// TODO: Make this less ugly
			throw new IOException(e);
		}
	}

	@Override
	protected void send(String command) throws IOException {
		sendUnsafe(command);
	}

	@Override
	protected void sendUnsafe(String command) {
		consoleOutput = comwrapper.execute(command);
			
		if(Platform.inDebugMode()) {
			System.out.println("\nMatlab send:\n\n" + command);
			System.out.println("\nMatlab return:\n" + consoleOutput);
		}
	}

	@Override
	protected String[] getMatlabOutput() throws IOException {
		return (">> " + consoleOutput).split("\n");
	}
}
