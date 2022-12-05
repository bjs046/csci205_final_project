package org.final_project;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.net.URL;
import javafx.scene.shape.Rectangle;

import javax.imageio.ImageIO;
import javax.swing.*;

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
    private ImageView backgroundBlurred2;

    @FXML
    private Button basketballButton;

    @FXML
    private Button footballButton;

    @FXML
    private Button soccerButton;

    @FXML
    private Text MusicVolume;

    @FXML
    private ImageView backGround;

    @FXML
    private CheckBox checkBox;

    @FXML
    private Slider volume;

    @FXML
    private ImageView soccerBackground;

    @FXML
    private Rectangle soccerCard;

    @FXML
    private ImageView soccerPfp;

    public CardSimController() throws IOException {
    }


    @FXML
    public void initialize() throws IOException{
        assert mainTitle != null : "fx:id=\"mainTitle\" was not injected: check your FXML file 'CardSim.fxml'.";
        assert optionsButton != null : "fx:id=\"optionsButton\" was not injected: check your FXML file 'CardSim.fxml'.";
        assert startAnchorPane != null : "fx:id=\"startAnchorPane\" was not injected: check your FXML file 'CardSim.fxml'.";
        assert startBackground != null : "fx:id=\"startBackground\" was not injected: check your FXML file 'CardSim.fxml'.";
        assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'CardSim.fxml'.";
        assert MakeCardButton != null : "fx:id=\"MakeCardButton\" was not injected: check your FXML file 'Pack.fxml'.";
        assert backgroundBlurred != null : "fx:id=\"backgroundBlurred\" was not injected: check your FXML file 'Pack.fxml'.";
        assert openPackButton != null : "fx:id=\"openPackButton\" was not injected: check your FXML file 'Pack.fxml'.";
        assert backgroundBlurred2 != null : "fx:id=\"backgroundBlurred2\" was not injected: check your FXML file 'ChooseSport.fxml'.";
        assert basketballButton != null : "fx:id=\"basketballButton\" was not injected: check your FXML file 'ChooseSport.fxml'.";
        assert footballButton != null : "fx:id=\"footballButton\" was not injected: check your FXML file 'ChooseSport.fxml'.";
        assert soccerButton != null : "fx:id=\"soccerButton\" was not injected: check your FXML file 'ChooseSport.fxml'.";

        assert MusicVolume != null : "fx:id=\"MusicVolume\" was not injected: check your FXML file 'Options.fxml'.";
        assert backGround != null : "fx:id=\"backGround\" was not injected: check your FXML file 'Options.fxml'.";
        assert checkBox != null : "fx:id=\"checkBox\" was not injected: check your FXML file 'Options.fxml'.";
        assert volume != null : "fx:id=\"volume\" was not injected: check your FXML file 'Options.fxml'.";
        assert soccerBackground != null : "fx:id=\"soccerBackground\" was not injected: check your FXML file 'Soccer.fxml'.";
        assert soccerCard != null : "fx:id=\"soccerCard\" was not injected: check your FXML file 'Soccer.fxml'.";
        assert soccerPfp != null : "fx:id=\"soccerPfp\" was not injected: check your FXML file 'Soccer.fxml'.";
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
    public void changeSceneOptions(ActionEvent event) throws IOException {
        Parent optionsScreenParent = FXMLLoader.load(getClass().getResource("/Options.fxml"));
        Scene optionsScreenScene = new Scene(optionsScreenParent);

        Stage optionsWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

        optionsWindow.setScene(optionsScreenScene);
        optionsWindow.show();
    }

    /**
     * Changing scenes from open a pack to basketball
     */
    public void packToBasketball(ActionEvent event) throws IOException {
        Parent basketballParent = FXMLLoader.load(getClass().getResource("/"));
        Scene basketballScene = new Scene(basketballParent);

        Stage basketballWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

        basketballWindow.setScene(basketballScene);
        basketballWindow.show();
    }

    /**
     * Changing scenes from open a pack to football
     */
    public void packToFootball(ActionEvent event) throws IOException {
        Parent footballParent = FXMLLoader.load(getClass().getResource("/"));
        Scene footballScene = new Scene(footballParent);

        Stage footballWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

        footballWindow.setScene(footballScene);
        footballWindow.show();
    }

    /**
     * Changing scenes from open a pack to soccer
     */
    public void packToSoccer(ActionEvent event) throws IOException {
        Parent soccerParent = FXMLLoader.load(getClass().getResource("/Soccer.fxml"));
        Scene soccerScene = new Scene(soccerParent);

        Stage soccerWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

        soccerWindow.setScene(soccerScene);
        soccerWindow.show();

        public void initialize(URL url, ResourceBundle rb) {
            // Running pack for soccer
            Pack testPack = new Pack();
            ArrayList<String[]> cardDrawn = testPack.drawSoccerCard(true);
            String soccerCardName = cardDrawn.get(0)[0];
            String soccerCardPosition = cardDrawn.get(0)[1];
            String soccerCardOverall = cardDrawn.get(0)[2];
            String soccerCardImage = testPack.URLLink.get(0);

        try (InputStream in = new URL(soccerCardImage).openStream()) {
            Files.copy(in, Paths.get("/playerpfp.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }






}

