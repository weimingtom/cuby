package javax.microedition.midlet;

import android.app.Activity;
import android.os.Bundle;

//TODO class MIDletContainer have to be public
//while MIDP spec does not allow public classes in javax.microedition.midlet package 
public class MIDletContainer extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); //TODO remove this line
        
        //sample code, at present, midlet developer 
        //compile their midlet source code together with cuby source code
        //no midlet loader concept is defined yet.
        midlet = new com.cuby.sample.HelloCubyMIDlet();
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
    	//sample code
        try {
        	//startApp is called when midlet is started and resumed
        	//so we put startApp callback in Activity.onResume()
			midlet.startApp(); 
		} catch (MIDletStateChangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    protected void onPause(){
    	super.onPause();
    	//sample code
    	midlet.pauseApp();
    	
    	//TODO: once Activity.onPause() is called, 
    	//android may kill MIDletContainerActivity process at any time
    	//so we might have to find a way to call destroyApp(true) in that case
    }

    @Override
    protected void onStop(){
    	super.onStop();
    }

    @Override
    protected void onDestroy(){
    	super.onDestroy();
    	//sample code
    	try {
			midlet.destroyApp(false);  //TODO maybe use true as parameter
		} catch (MIDletStateChangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }    
    
    /**
    * the midlet in user space
    * current design is: 1 activity is mapping to 1 midlet  
     */
    private MIDlet midlet;
}