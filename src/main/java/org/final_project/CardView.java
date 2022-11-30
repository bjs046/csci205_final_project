package org.final_project;/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2022
 * Instructor: Prof. Brian King
 *
 * Name: Brian Scotto
 * Section: 11 AM
 * Date: 11/23/2022
 * Time: 7:19 PM
 *
 * Project: csci205_final_project
 * Package: PACKAGE_NAME
 * Class: org.final_project.CardView
 *
 * Description:
 *
 * ****************************************
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class CardView extends Application {

    private BorderPane root;

    private FlowPane titlePane;

    private Label title;
    private Button start;

    private Button options;


    public BorderPane getRoot() {
        return root;
    }

    public FlowPane getTitlePane() {
        return titlePane;
    }

    public Label getTitle() {
        return title;
    }

    public Button getStart() {
        return start;
    }

    public Button getOptions() {
        return options;
    }

    public void initSceneGraph(){
        root = new BorderPane();

        // pane to hold title
        titlePane = new FlowPane();


        titlePane.getChildren().add(new Label("Player Card Creator"));

        options = new Button("Options");
        start = new Button("Start");


        root.setTop(titlePane);
        root.setLeft(start);
        root.setCenter(options);


    }

    public void initStyling(){

        titlePane.setAlignment(Pos.CENTER);
        try{
            Image img = ImageIO.read(new File("sportscard.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        initSceneGraph();
        //initStyling();



        Scene scene = new Scene(root);
        scene.getStylesheets().add("java/org/final_project/CardView.css");


        primaryStage.setTitle("Player Card Creator");
        primaryStage.setScene(scene);

        primaryStage.sizeToScene();


        primaryStage.show();

    }


}
