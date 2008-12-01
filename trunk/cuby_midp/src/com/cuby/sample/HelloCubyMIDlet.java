/**
 * 
 */
package com.cuby.sample;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.lcdui.*;
/**
 * @author guest
 *
 */
public class HelloCubyMIDlet extends MIDlet {

	/* (non-Javadoc)
	 * @see javax.microedition.midlet.MIDlet#destroyApp(boolean)
	 */
	protected void destroyApp(boolean unconditional)
			throws MIDletStateChangeException {
		// TODO Auto-generated method stub
		System.out.println("HelloCubyMIDlet: destroyApp");
		notifyDestroyed(); //WTK samples usually do this
	}

	/* (non-Javadoc)
	 * @see javax.microedition.midlet.MIDlet#pauseApp()
	 */
	protected void pauseApp() {
		// TODO Auto-generated method stub
		System.out.println("HelloCubyMIDlet: pauseApp");
	}

	/* (non-Javadoc)
	 * @see javax.microedition.midlet.MIDlet#startApp()
	 */
	protected void startApp() throws MIDletStateChangeException {
		System.out.println("HelloCubyMIDlet: startApp");
	}


}
