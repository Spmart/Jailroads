package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.cells.rails.RailsTShape;
import model.cells.rails.RailsTurn;
import model.cells.road.RoadTurn;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        RoadTurn turn = new RoadTurn();
        System.out.println(turn.toString());

    }


    public static void main(String[] args) {
        launch(args);
    }
}
