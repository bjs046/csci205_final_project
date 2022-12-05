package org.final_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CardSimController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label mainTitle;

    @FXML
    private Button optionsButton;

    @FXML
    private AnchorPane startAnchorPane;

    @FXML
    private ImageView startBackground;

    @FXML
    private Button startButton;

    @FXML
    private Button MakeCardButton;

    @FXML
    private ImageView backgroundBlurred;

    @FXML
    private Button openPackButton;


    @FXML
    void initialize() {
        assert mainTitle != null : "fx:id=\"mainTitle\" was not injected: check your FXML file 'CardSim.fxml'.";
        assert optionsButton != null : "fx:id=\"optionsButton\" was not injected: check your FXML file 'CardSim.fxml'.";
        assert startAnchorPane != null : "fx:id=\"startAnchorPane\" was not injected: check your FXML file 'CardSim.fxml'.";
        assert startBackground != null : "fx:id=\"startBackground\" was not injected: check your FXML file 'CardSim.fxml'.";
        assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'CardSim.fxml'.";
        assert MakeCardButton != null : "fx:id=\"MakeCardButton\" was not injected: check your FXML file 'Pack.fxml'.";
        assert backgroundBlurred != null : "fx:id=\"backgroundBlurred\" was not injected: check your FXML file 'Pack.fxml'.";
        assert openPackButton != null : "fx:id=\"openPackButton\" was not injected: check your FXML file 'Pack.fxml'.";
    }


    /**
     * Changing scenes from start screen to choosing to open a pack or make
     * your own card
     */
    @FXML
    public void changeScene1(ActionEvent event) throws IOException {
        Parent startScreenParent = FXMLLoader.load(getClass().getResource("/Pack.fxml"));
        Scene startScreenScene = new Scene(startScreenParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(startScreenScene);
        window.show();
    }

    /**
     * Changing scenes from opening a pack to choosing which sport pack to open
     */
    @FXML
    public void changeScene2(ActionEvent event) throws IOException {
        Parent packScreenParent = FXMLLoader.load(getClass().getResource("/ChooseSport.fxml"));
        Scene packScreenScene = new Scene(packScreenParent);

        Stage window2 = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window2.setScene(packScreenScene);
        window2.show();
    }

    /**
     * Changing scenes from options to options window
     */
}

