package pane;

import config.config;
import java.util.ArrayList;

import javafx.scene.layout.HBox;

public class ShaftZonePane extends HBox {
	private ArrayList<ShaftLanePane> shaftLanePanes;

	public ShaftZonePane() {
		this.setPrefSize(config.SCREEN_WIDTH * (0.27), config.SCREEN_HIGHT * (0.95));
		this.shaftLanePanes = new ArrayList<>();
		
		ShaftLanePane shaftLane1 = new ShaftLanePane();
		ShaftLanePane shaftLane2 = new ShaftLanePane();
		ShaftLanePane shaftLane3 = new ShaftLanePane();
		shaftLanePanes.add(shaftLane1);
		shaftLanePanes.add(shaftLane2);
		shaftLanePanes.add(shaftLane3);

		for (int i = 0; i < shaftLanePanes.size(); i++) {
			this.getChildren().add(shaftLanePanes.get(i));
		}
		
		
	}

}
