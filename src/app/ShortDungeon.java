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
import static app.Direction.*;

public class ShortDungeon extends Application {

    GraphicsContext gra;
    Mode gameMode = TEST;
    static int[][] map = {
        // 1...wall(移動できない),0...floor(床)
        // ただし一番外側は必ず壁。
        {1,1,1,1,1,1,1,1,1,1,1,1},//1
        {1,0,0,0,0,0,0,0,0,0,0,1},//2
        {1,0,0,0,0,0,0,0,0,0,0,1},//3
        {1,0,0,0,0,0,0,0,0,0,0,1},//4
        {1,0,0,0,0,0,0,0,0,0,0,1},//5
        {1,0,0,0,0,0,0,0,0,0,0,1},//6
        {1,0,0,0,0,0,0,0,0,0,0,1},//7
        {1,0,0,0,0,0,0,0,0,0,0,1},//8
        {1,0,0,0,0,0,0,0,0,0,0,1},//9
        {1,0,0,0,0,0,0,0,0,0,0,1},//10
        {1,0,0,0,0,0,0,0,0,0,0,1},//11
        {1,1,1,1,1,1,1,1,1,1,1,1} //12
    };

    @Override
    public void start(Stage stage) {

        stage.setTitle("ShortDungeon");

        Group root = new Group();

		Canvas cvs = new Canvas(300, 300);
		root.getChildren().add(cvs);
        
        gra=cvs.getGraphicsContext2D();

		Scene scene = new Scene(root, 300, 300, Color.WHITE);
        
		stage.setScene(scene);

        stage.setResizable(false);

		stage.show();

        AnimationTimer timer = new AnimationTimer() {
        
            @Override
            public void handle(long arg0) {
                gra.setFill(Color.NAVY);
                gra.fillRect(0, 0, 400, 300);
                switch(gameMode){

                    case START:
                        break;
                    case SELECT:
                        break;
                    case GAME:
                        break;
                    case LOAD:
                        break;
                    case LOSE:
                        gra.setFont(new Font(50));
                        gra.setFill(Color.RED);
                        gra.fillText("GAMEOVER", 75,100);
                        gra.setFont(new Font(25));
                        gra.fillText("Push the Esc to close the Window", 23, 200);
                        break;
                    case CLEAR:
                        gra.setFont(new Font(50));
                        gra.setFill(Color.YELLOW);
                        gra.fillText("GAMECLEAR", 75,100);
                        gra.setFont(new Font(25));
                        gra.fillText("Push the Esc to close the Window", 23, 200);
                        break;
                    case TEST:
                        gra.setFill(Color.WHITE);
                        for (int i = 0; i < map.length; i++) {
                            for (int j = 0; j < map[0].length; j++) {
                                if(map[i][j]==0){
                                    gra.setFill(Color.WHITE);
                                    gra.fillRect(j*20, i*20, 20, 20);
                                }else{
                                    gra.setFill(Color.BLACK);
                                    gra.fillRect(j*20, i*20, 20, 20);
                                }
                            }
                        }
                        break;
                    default:
                        break;
                }              
            }
        };
        timer.start();
 
    }

    public static void main(String[] args) {
        makeMaze();

        for (int i = 0; i < map.length; i++) {
            System.out.println("");
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]+" ");
            }
        }
        launch(args);
    }



    private static void makeMaze(){
        for (int y = 2; y < 11; y+=2) {
            for (int x = 2; x < 11; x+=2) {
                // 一個飛ばしで壁を置く
                map[y][x]=1;
                if(y!=10){
                    switch (randDirection()) {
                        case UP:
                            map[y-1][x]=1;
                            break;
                        case DOWN:
                            map[y+1][x]=1;
                            break;
                        case LEFT:
                            map[y][x-1]=1;
                            break;
                        case RIGHT:
                            map[y][x+1]=1;
                            break;
                        default:
                            break;
                    }
                }else{
                    switch (randDirection()) {
                        case UP:
                        case LEFT:
                            map[y][x-1]=1;
                            break;
                        case DOWN:
                        case RIGHT:
                            map[y][x+1]=1;
                            break;
                        default:
                            break;
                    }
                }

            }
        }
        makeDungeon();
    }
    private static void makeDungeon(){
        int rand = rand(6);
        for(int i=3;i<4+rand;i+=rand){
            for(int j=3;j<4+rand;j+=rand){
                for (int k=-1;k<2;k++) {
                    for(int p=-1;p<2;p++){
                        map[i+k][j+p]=0;               
                    }
                }
            }
        }
    }

    public static Direction randDirection(){
        switch (new java.util.Random().nextInt(4)) {
            case 0:
                return UP;        
            case 1:
                return DOWN;
            case 2:
                return LEFT;
            case 3:
                return RIGHT;
            default:
                return RIGHT;
        }
    }
    private static int rand(int max){
        max-=3;
        return new java.util.Random().nextInt(max)+3;
    }

}
