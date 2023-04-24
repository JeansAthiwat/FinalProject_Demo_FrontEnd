package pane;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class FloorZonePane extends VBox {
	private ArrayList<FloorLevelPane> floorLevelPanes;

	public FloorZonePane() {
		this.floorLevelPanes = new ArrayList<>();
		this.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, null, null)));
		this.setPadding(new Insets(3));
		this.setSpacing(2);
		
		FloorLevelPane floorLevel1 = new FloorLevelPane();
		FloorLevelPane floorLevel2 = new FloorLevelPane();
		FloorLevelPane floorLevel3 = new FloorLevelPane();
		FloorLevelPane floorLevel4 = new FloorLevelPane();
		FloorLevelPane floorLevel5 = new FloorLevelPane();
		FloorLevelPane floorLevel6 = new FloorLevelPane();
		FloorLevelPane floorLevel7 = new FloorLevelPane();

		floorLevelPanes.add(floorLevel1);
		floorLevelPanes.add(floorLevel2);
		floorLevelPanes.add(floorLevel3);
		floorLevelPanes.add(floorLevel4);
		floorLevelPanes.add(floorLevel5);
		floorLevelPanes.add(floorLevel6);
		floorLevelPanes.add(floorLevel7);

		for (int i = 0; i < floorLevelPanes.size(); i++) {
			this.getChildren().add(floorLevelPanes.get(i));
		}

	}
}
