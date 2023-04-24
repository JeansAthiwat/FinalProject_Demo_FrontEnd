package pane;

import config.config;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class ShaftLanePane extends GridPane {

	public ShaftLanePane() {
		this.setBackground(new Background(new BackgroundFill(Color.GREY, null, null)));
		this.setPrefSize(config.SCREEN_WIDTH * (0.09), config.SCREEN_HIGHT * (0.91));
	}

}
