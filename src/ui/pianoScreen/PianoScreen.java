package ui.pianoScreen;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.program.Screen;

public class PianoScreen extends Screen {
	
	private PianoScreenController controller;
	
	public PianoScreen(Stage stage) throws IOException {
		super(stage);
        this.stage = stage;
        this.title = "Bastille raiding";

        this.controller = new PianoScreenController(this);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pianoScreen.fxml"));
        loader.setController(controller);

        Parent root = loader.load();
        this.scene = new Scene(root);
        screens.put("title", this);
	}

}
