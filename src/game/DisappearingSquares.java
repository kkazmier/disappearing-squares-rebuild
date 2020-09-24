package game;

import game.gui.GameScene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisappearingSquares extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GameScene gameScene = new GameScene();
        primaryStage.setScene(gameScene.getScene());
        primaryStage.show();
    }

}
