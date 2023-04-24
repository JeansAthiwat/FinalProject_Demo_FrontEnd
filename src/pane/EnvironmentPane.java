package pane;

import config.config;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class EnvironmentPane extends StackPane {
	private HotelBackgroundPane hotelbackgroundStackPane;
	private HotelPane hotelBorderPane;

	public EnvironmentPane() {
		this.setBackground(new Background(new BackgroundFill(Color.LIGHTCYAN, null, null)));
		this.setPrefSize((config.SCREEN_WIDTH * (0.75)), config.SCREEN_HIGHT);

		this.hotelbackgroundStackPane = new HotelBackgroundPane();
		this.hotelBorderPane = new HotelPane();

		this.getChildren().add(hotelbackgroundStackPane);
		this.getChildren().add(hotelBorderPane);
	}

}
