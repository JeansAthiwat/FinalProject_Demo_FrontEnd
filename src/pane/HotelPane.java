package pane;

import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;

public class HotelPane extends BorderPane {
	private ShaftZonePane shaftsHBox;
	private FloorsPane floorsVBox;

	public HotelPane() {
		this.shaftsHBox = new ShaftZonePane();
		this.floorsVBox = new FloorVBox();

	}
}
