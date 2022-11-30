package org.final_project;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CardSimMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Loads the FXMLfile. Obtain the root of the scene graph
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CardSimView.fxml"));
        Parent root = loader.load();

        // Set up the stage and show it
        primaryStage.setTitle("Card Sim");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
