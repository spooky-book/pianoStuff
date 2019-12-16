package ui.program;

import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 * the abstract class that should be the base for all other screens
 * @author Daniel
 *
 */
public abstract class Screen {
	
	protected static HashMap<String, Screen> screens = new HashMap<String, Screen>();
	protected Stage stage;
	protected String title;
	protected Scene scene;
	private Screen previousScreen;
    
	/**
	 * constructs a screen
	 * @param stage	the stage that this screen should display on
	 */	
    public Screen(Stage stage) {
    	this.stage = stage;
    }
    
    /**
     * Changes the scene on the stage to the screen that calls this method
     * sets the root of the scene as the focus
     */
    public void start() {
    	stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
        scene.getRoot().requestFocus();
        System.out.println("Focus: " + scene.focusOwnerProperty());
    }
    
    /**
     * Shows a screen by name
     * basically calls the corresponding screens start method
     * @param screenName	the screen you are trying to show
     */
    public void showScreen(String screenName) {
    	Screen nextScreen = screens.get(screenName);
    	if (nextScreen == null) {
    		return;
    	}
    	previousScreen = this;
    	nextScreen.setPreviousScreen(this);
    	nextScreen.start();
    }
    
    /**
     * shows the previous screen that was displayed
     */
    public void showPreviousScreen() {
    	Screen temp = previousScreen;
    	previousScreen = this;
    	temp.start();
    }
    
    /**
     * manually allows you to set the previous screen 
     * @param screen	the screen you want as the previous screen
     */
    public void setPreviousScreen(Screen screen) {
    	previousScreen = screen;
    }
    
    public String getTitle() {
    	return title;
    }
    
    /**
     * gets a screen by the name of the screen
     * 
     * @param name	the name of the screen needed
     * @return	the screen with the name given above
     */
    public Screen getScreenByName(String name) {
    	return screens.get(name);
    }
    

}
