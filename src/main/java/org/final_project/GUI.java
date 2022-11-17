/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Brandon Cho
 * Section: 02
 * Date: 11/16/2022
 * Time: 11:39 AM
 *
 * Project: csci205_final_project
 * Package: org.final_project
 * Class: GUI
 *
 * Description:
 *
 * ****************************************
 */


package org.final_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class GUI {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Grabbing property values from system
        String javaVersion = System.getProperty("java.version");
        String javafxVersion= System.getProperty("javafx.version");

        // Making scene graph
        StackPane pane = new StackPane();
    }
}
