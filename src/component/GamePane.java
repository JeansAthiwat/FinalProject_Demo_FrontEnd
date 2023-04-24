package component;

import config.config;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class GamePane extends Pane {
	private StackPane environmentStackPane;
	private VBox sideBarVBox;
	private BorderPane screenBorderPane;

	public GamePane() {
		this.environmentStackPane = new StackPane();
		this.sideBarVBox = new VBox();
		this.screenBorderPane = new BorderPane();

		this.environmentStackPane.setBackground(new Background(new BackgroundFill(Color.LIGHTCYAN, null, null)));
		this.environmentStackPane.setPrefSize((config.SCREEN_WIDTH*(0.75)), config.SCREEN_HIGHT);

		this.sideBarVBox.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
		this.sideBarVBox.setPrefSize((config.SCREEN_WIDTH*(0.25)), config.SCREEN_HIGHT);

		screenBorderPane.setRight(sideBarVBox);
		screenBorderPane.setLeft(environmentStackPane);
//		screenBorderPane.setPrefSize(config.SCREEN_WIDTH, config.SCREEN_HIGHT);

		this.getChildren().add(screenBorderPane);
	}

}
