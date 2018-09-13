package app.graphics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../sample.fxml"));

        String pathImage = "../res/javafx.png";
        ImageView imageView = new ImageView(getClass().getResource(pathImage).toString());
        ((GridPane) root).add(imageView, 0,0);

        Button buttonExit = new Button("Exit");
        buttonExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("..... la reverere!");
                primaryStage.close();
            }
        });
        ((GridPane) root).add(buttonExit,0,1);


        primaryStage.setTitle("Loading image!");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
