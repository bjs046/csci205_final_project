package org.final_project;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
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
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @FXML
    private Text soccerName;

    @FXML
    private Text soccerOverall;

    @FXML
    private Text soccerPosition;

    @FXML
    private ImageView soccerBlurred;

    @FXML
    private AnchorPane soccerAnchor;

    @FXML
    private Rectangle bballCard;

    @FXML
    private ImageView bballCardImage;

    @FXML
    private ImageView bballCourt;

    @FXML
    private Label basketballName;

    @FXML
    private Label basketballOverall;

    @FXML
    private Label basketballPosition;

    @FXML
    private Text footballName;

    @FXML
    private Text footballOverall;

    @FXML
    private Text footballPosition;

    @FXML
    private ImageView basketballLoadingBackground;

    @FXML
    private Text basketballLoadingQuestion;

    @FXML
    private Button basketballNo;

    @FXML
    private Button basketballYes;


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
        assert soccerBlurred != null : "fx:id=\"soccerBlurred\" was not injected: check your FXML file 'SoccerLoading.fxml'.";
        assert soccerAnchor != null : "fx:id=\"soccerAnchor\" was not injected: check your FXML file 'SoccerLoading.fxml'.";
        assert bballCard != null : "fx:id=\"bballCard\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert bballCardImage != null : "fx:id=\"bballCardImage\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert bballCourt != null : "fx:id=\"bballCourt\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert basketballName != null : "fx:id=\"basketballName\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert basketballOverall != null : "fx:id=\"basketballOverall\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert basketballPosition != null : "fx:id=\"basketballPosition\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert soccerName != null : "fx:id=\"soccerName\" was not injected: check your FXML file 'Soccer.fxml'.";
        assert soccerOverall != null : "fx:id=\"soccerOverall\" was not injected: check your FXML file 'Soccer.fxml'.";
        assert soccerPosition != null : "fx:id=\"soccerPosition\" was not injected: check your FXML file 'Soccer.fxml'.";
        assert footballName != null : "fx:id=\"footballName\" was not injected: check your FXML file 'Football.fxml'.";
        assert footballOverall != null : "fx:id=\"footballOverall\" was not injected: check your FXML file 'Football.fxml'.";
        assert footballPosition != null : "fx:id=\"footballPosition\" was not injected: check your FXML file 'Football.fxml'.";
        assert basketballLoadingBackground != null : "fx:id=\"basketballLoadingBackground\" was not injected: check your FXML file 'BasketballLoading.fxml'.";
        assert basketballLoadingQuestion != null : "fx:id=\"basketballLoadingQuestion\" was not injected: check your FXML file 'BasketballLoading.fxml'.";
        assert basketballNo != null : "fx:id=\"basketballNo\" was not injected: check your FXML file 'BasketballLoading.fxml'.";
        assert basketballYes != null : "fx:id=\"basketballYes\" was not injected: check your FXML file 'BasketballLoading.fxml'.";
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

    @FXML
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
     * Code
     */
//    public void packToBasketballLoading(ActionEvent event) throws IOException {
//        // Storing information about basketball
//        Parent basketballLoadingParent = FXMLLoader.load(getClass().getResource("/BasketballLoading.fxml"));
//        Scene basketballLoadingScene = new Scene(basketballLoadingParent);
//
//        Stage basketballLoadingWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//        basketballLoadingWindow.setScene(basketballLoadingScene);
//        basketballLoadingWindow.show();
//
//        Pack testPack1 = new Pack();
//        ArrayList<String[]> cardDrawn = testPack1.drawBasketballCard(true);
//        String basketballCardName = cardDrawn.get(0)[0];
//        String basketballCardPosition = cardDrawn.get(0)[1];
//        String basketballCardOverall = cardDrawn.get(0)[2];
//        String basketballCardImage = testPack1.URLLink.get(0);
//
//        URL basketballURL= new URL(basketballCardImage);
//        InputStream is = basketballURL.openStream();
//        FileOutputStream fo = new FileOutputStream("src/main/resources/sportpfp.jpg");
//        int x = 0;
//        while ((x = is.read())!=-1) {
//            fo.write(x);
//        }
//        fo.close();
//        is.close();
//    }
    @FXML
    /**
     * Changing scenes from open a pack to basketball
     */
    public void packToBasketball(ActionEvent event) throws IOException {
        // Storing information about basketball
        Parent basketballParent = FXMLLoader.load(getClass().getResource("/BasketballCard.fxml"));
        Scene basketballScene = new Scene(basketballParent);

        Stage basketballWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

        basketballWindow.setScene(basketballScene);
        basketballWindow.show();

        Pack testPack1 = new Pack();
        ArrayList<String[]> cardDrawn = testPack1.drawBasketballCard(true);
        String basketballCardName = cardDrawn.get(0)[0];
        String basketballCardPosition = cardDrawn.get(0)[1];
        String basketballCardOverall = cardDrawn.get(0)[2];
        String basketballCardImage = testPack1.URLLink.get(0);

        URL basketballURL= new URL(basketballCardImage);
        InputStream is = basketballURL.openStream();
        FileOutputStream fo = new FileOutputStream("src/main/resources/playerpfp.jpg");
        int x = 0;
        while ((x = is.read())!=-1) {
            fo.write(x);
        }
        fo.close();
        is.close();

        basketballName.setText(basketballCardName);
        basketballPosition.setText(basketballCardPosition);
        basketballOverall.setText(basketballCardOverall);
    }

    @FXML
    /**
     * Changing scenes from open a pack to football
     */
    public void packToFootball(ActionEvent event) throws IOException {
        Parent footballParent = FXMLLoader.load(getClass().getResource("/Football.fxml"));
        Scene footballScene = new Scene(footballParent);

        Stage footballWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

        footballWindow.setScene(footballScene);
        footballWindow.show();

        Pack testPack2 = new Pack();
        ArrayList<String[]> cardDrawn = testPack2.drawFootballCard(true);
        String footballCardName = cardDrawn.get(0)[0];
        String footballCardPosition = cardDrawn.get(0)[1];
        String footballCardOverall = cardDrawn.get(0)[2];
        String footballCardImage = testPack2.URLLink.get(0);
        URL footballURL= new URL(footballCardImage);
        InputStream is = footballURL.openStream();
        FileOutputStream fo = new FileOutputStream("src/main/resources/playerpfp.jpg");
        int x = 0;
        while ((x = is.read())!=-1) {
            fo.write(x);
        }
        fo.close();
        is.close();
    }

    @FXML
    /**
     * Changing scenes from soccer loading screen to soccer pack screen
     */
    public void packToSoccer(ActionEvent event) throws IOException {
        // Storing information about soccer
        Parent soccerParent = FXMLLoader.load(getClass().getResource("/Soccer.fxml"));
        Scene soccerScene = new Scene(soccerParent);

        Stage soccerWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

        soccerWindow.setScene(soccerScene);
        soccerWindow.show();


        Pack testPack3 = new Pack();
        ArrayList<String[]> cardDrawn = testPack3.drawSoccerCard(true);
        String soccerCardName = cardDrawn.get(0)[0];
        String soccerCardPosition = cardDrawn.get(0)[1];
        String soccerCardOverall = cardDrawn.get(0)[2];
        String soccerCardImage = testPack3.URLLink.get(0);

        URL soccerURL= new URL(soccerCardImage);
        InputStream is = soccerURL.openStream();

        FileOutputStream fo = new FileOutputStream("src/main/resources/playerpfp.jpg");
        int x = 0;
        while ((x = is.read())!=-1) {
            fo.write(x);
        }
        fo.close();
        is.close();
    }
}

