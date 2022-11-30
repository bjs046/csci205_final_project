/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Brandon Cho
 * Section: 02
 * Date: 11/28/2022
 * Time: 7:47 AM
 *
 * Project: csci205_final_project
 * Package: org.final_project
 * Class: GUIController
 *
 * Description:
 *
 * ****************************************
 */
package org.final_project;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class CardSimController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane programTitle;

    @FXML
    void initialize() {
        assert programTitle != null : "fx:id=\"programTitle\" was not injected: check your FXML file 'CardSimView.fxml'.";

    }
    private Button startButton;
    public void btnNewWindow(ActionEvent actionEvent) {

    }
}
