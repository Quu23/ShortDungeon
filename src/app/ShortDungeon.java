package app;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static app.Mode.*;

public class ShortDungeon extends Application {

    GraphicsContext gra;
    Mode gameMode = LOSE;

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
                gra.setFill(Color.BLACK);
                gra.fillRect(0, 0, 400, 300);
                switch(gameMode){

                    case START:
                        break;
                    case SELECT:
                        break;
                    case GAME:
                        break;
                    case LOSE:
                        gra.setFont(new Font(50));
                        gra.setFill(Color.RED);
                        gra.fillText("GAMEOVER", 75,100);
                        gra.setFont(new Font(25));
                        gra.fillText("Push the Esc to close the Window", 23, 200);
                        break;
                    case CLEAR:
                        break;
                    default:
                        gra.setFill(Color.BLACK);
                        gra.fillRect(0, 0, 400, 300);
                        break;
                }              
            }
        };
        timer.start();
 
    }
    public static void main(String[] args) {
        launch(args);
    }
}
