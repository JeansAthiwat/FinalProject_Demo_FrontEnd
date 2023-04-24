package pane;

import config.config;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class HotelBackgroundPane extends StackPane {
	public HotelBackgroundPane() {
		this.setBackground(new Background(new BackgroundFill(Color.LIGHTSKYBLUE, null, null)));
		this.setPrefSize((config.SCREEN_WIDTH * (0.75)), config.SCREEN_HIGHT);
	}
}
