package ui.program;

import javafx.application.Application;
import javafx.stage.Stage;
import ui.pianoScreen.PianoScreen;

public class PianoProgram extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		PianoScreen pianoScreen = new PianoScreen(primaryStage);
		
		pianoScreen.start();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
