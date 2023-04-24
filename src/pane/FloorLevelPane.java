package pane;

import config.config;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class FloorLevelPane extends StackPane {

	public FloorLevelPane() {
		this.setBackground(new Background(new BackgroundFill(Color.BROWN, null, null)));
		this.setBorder(new Border(new BorderStroke(Color.WHITE, null, new CornerRadii(5), new BorderWidths(3), null)));
		this.setPrefSize(config.SCREEN_WIDTH * (0.38), config.SCREEN_HIGHT * (0.13));
	}
}
