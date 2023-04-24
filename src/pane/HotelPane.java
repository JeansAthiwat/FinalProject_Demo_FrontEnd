package pane;

import config.config;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class HotelPane extends GridPane {
	private ShaftZonePane shaftZoneHBox;
	private FloorZonePane floorZoneVBox;

	public HotelPane() {
		this.shaftZoneHBox = new ShaftZonePane();
		this.floorZoneVBox = new FloorZonePane();
		
		BorderPane borderPane = new BorderPane();
		
		borderPane.setLeft(shaftZoneHBox);
		borderPane.setRight(floorZoneVBox);
		this.setPrefSize(config.SCREEN_WIDTH * (0.70), config.SCREEN_HIGHT * (0.91));
		this.setAlignment(Pos.CENTER);

		
		this.getChildren().add(borderPane);
		
	}
}
