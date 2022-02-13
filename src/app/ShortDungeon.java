package app;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import static app.Mode.*;

public class ShortDungeon extends Application {

    GraphicsContext gra;
    Mode gameMode = START;

    @Override
    public void start(Stage stage) {

        stage.setTitle("ShortDungeon");

        Group root = new Group();

		Canvas cvs = new Canvas(400, 300);
		root.getChildren().add(cvs);
        
        gra=cvs.getGraphicsContext2D();

		Scene scene = new Scene(root, 400, 300, Color.WHITE);
        
		stage.setScene(scene);
		stage.show();

        AnimationTimer timer = new AnimationTimer() {
           
            @Override
            public void handle(long arg0) {
                
                
            }
        };
 
    }
    public static void main(String[] args) {
        launch(args);
    }
}
