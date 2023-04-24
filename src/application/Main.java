package application;

import config.config;
import component.GamePane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		Pane gamePane = new GamePane();

		Scene scene = new Scene(gamePane, config.SCREEN_WIDTH, config.SCREEN_HIGHT);

		stage.setScene(scene);
		stage.setTitle("ELEVATOR SIMULATOR!!");
		stage.setResizable(false);
		stage.show();
	}

	static void main(String[] args) {
		launch();
	}
}
