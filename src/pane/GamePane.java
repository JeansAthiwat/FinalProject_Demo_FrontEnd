package pane;

import config.config;
import javafx.scene.layout.BorderPane;

public class GamePane extends BorderPane {
	private EnvironmentPane environmentStackPane;
	private SideBarPane sideBarVBox;

	public GamePane() {
		this.environmentStackPane = new EnvironmentPane();
		this.sideBarVBox = new SideBarPane();

		this.setRight(sideBarVBox);
		this.setLeft(environmentStackPane);
		this.setPrefSize(config.SCREEN_WIDTH, config.SCREEN_HIGHT);

	}

}
