package pane;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class HotelBackgroundPane extends StackPane {
	public HotelBackgroundPane() {
		this.setBackground(new Background(new BackgroundFill(Color.GOLD, null, null)));
	}
}
