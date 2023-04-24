package pane;

import java.util.ArrayList;

import javafx.scene.layout.HBox;

public class ShaftZonePane extends HBox {
	private ArrayList<ShaftLanePane> ShaftLanePanes;

	public ShaftZonePane() {
		ShaftLanePane ShaftLane1 = new ShaftLanePane();
		ShaftLanePane ShaftLane2 = new ShaftLanePane();
		ShaftLanePane ShaftLane3 = new ShaftLanePane();
		ShaftLanePanes.add(ShaftLane1);
		ShaftLanePanes.add(ShaftLane2);
		ShaftLanePanes.add(ShaftLane3);

		for (int i = 0; i < ShaftLanePanes.size(); i++) {
			this.getChildren().add(ShaftLanePanes.get(i));
		}
	}

}
