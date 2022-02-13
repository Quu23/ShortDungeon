package app;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShortDungeon extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("ShortDungeon");

        Group root = new Group();

		Canvas cvs = new Canvas(400, 300);
		root.getChildren().add(cvs);
        
		Scene scene = new Scene(root, 400, 300, Color.WHITE);
        
		stage.setScene(scene);
		stage.show();
 
    }
    public static void main(String[] args) {
        launch(args);
    }
}
