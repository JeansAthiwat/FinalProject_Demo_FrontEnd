package pane;

import config.config;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SideBarPane extends VBox {
	private VBox informationVBox;
	private VBox constructionVBox;
	private StackPane menuStackPane;

	public SideBarPane() {
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
		this.setPrefSize((config.SCREEN_WIDTH * (0.25)), config.SCREEN_HIGHT);

		this.informationVBox = new VBox();
		this.constructionVBox = new VBox();
		this.menuStackPane = new StackPane();

		informationVBox.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, null, new Insets(5))));
		informationVBox.setPrefHeight(config.SCREEN_HIGHT * (0.20));
		informationVBox.setPadding(new Insets(5));

		constructionVBox.setBackground(new Background(new BackgroundFill(Color.LIGHTSALMON, null, new Insets(5))));
		constructionVBox.setPrefHeight(config.SCREEN_HIGHT * (0.70));
		constructionVBox.setPadding(new Insets(5));

		menuStackPane.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, null, new Insets(5))));
		menuStackPane.setPrefHeight(config.SCREEN_HIGHT * (0.1));
		menuStackPane.setPadding(new Insets(5));

		this.getChildren().add(informationVBox);
		this.getChildren().add(constructionVBox);
		this.getChildren().add(menuStackPane);

	}

}
