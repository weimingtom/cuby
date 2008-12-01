package javax.microedition.midlet;

import java.io.PrintStream;

import android.app.Activity;
import android.os.Bundle;

//TODO class MIDletContainer should not be public
//while MIDP spec does not allow public classes in javax.microedition.midlet package 
public class MIDletContainer extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); //TODO remove this line
        
        System.setErr(new PrintStream(new com.cuby.util.LogOutputStream(
				"System.err")));
        System.setOut(new PrintStream(new com.cuby.util.LogOutputStream(
				"System.out"))); 

        // TODO check 1st start or restart or kill-regenerated
        //here suppose 1st start
        
        //option 1: TODO load midlet class from "jar"
        //create midlet classloader, load the class from "jar"
        
        //option 2: link the midlet with cuby into one apk
        //midlet developer compile their midlet source code together with cuby source code
        //no midlet loader is needed.
        
        //construct midlet, with option 2:
        midlet = new com.cuby.sample.HelloCubyMIDlet();
        midlet.setStatus(MIDlet.LOADED);
        
    }
    
    @Override
    protected void onStart(){
    	super.onStart();
    }
    
    @Override
    protected void onRestart(){
    	super.onRestart();
    }

    @Override
    protected void onResume(){
    	super.onResume();
        try {
        	//startApp is mapped to onResume
			midlet.startApp(); 
			midlet.setStatus(MIDlet.ACTIVE);
		} catch (MIDletStateChangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    protected void onPause(){
    	super.onPause();
    	//pauseApp is mapped to onPause
    	midlet.pauseApp();
    	midlet.setStatus(MIDlet.PAUSED);
    }

    @Override
    protected void onStop(){
    	super.onStop();
    }

    @Override
    protected void onDestroy(){
    	super.onDestroy();

    	try {
			midlet.destroyApp(true);//true: midlet must cleanup and quit.  
		} catch (MIDletStateChangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RuntimeException rte){
			rte.printStackTrace();//ignored, according to midp spec
		}
		
		midlet.setStatus(MIDlet.DESTROYED);
    }    
    
    /**
    * the midlet in user space
    * current design is: 1 activity is mapping to 1 midlet  
     */
    private MIDlet midlet;
}