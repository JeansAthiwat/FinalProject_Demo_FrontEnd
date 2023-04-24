package application;

import config.config;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pane.GamePane;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		GamePane gamePane = new GamePane();

		Scene scene = new Scene(gamePane, config.SCREEN_WIDTH, config.SCREEN_HIGHT);

		stage.setScene(scene);
		stage.setTitle("ELEVATOR SIMULATOR!!");
		stage.setResizable(true);
		stage.show();
	}

	static void main(String[] args) {
		launch();
	}
}
