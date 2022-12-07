package org.final_project;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

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
    public Text soccerName;

    @FXML
    public Text soccerOverall;

    @FXML
    public Text soccerPosition;

    @FXML
    private ImageView soccerBlurred;

    @FXML
    private AnchorPane soccerAnchor;

    @FXML
    private ImageView basketballBackground;

    @FXML
    private Rectangle basketballCard;

    @FXML
    private Text basketballName;

    @FXML
    private Text basketballOverall;

    @FXML
    private ImageView basketballPfp;

    @FXML
    private Text basketballPosition;

    @FXML
    private Text footballName;

    @FXML
    private Text footballOverall;

    @FXML
    private Text footballPosition;


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
        assert basketballCard != null : "fx:id=\"bballCard\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert basketballPfp != null : "fx:id=\"bballCardImage\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert basketballBackground != null : "fx:id=\"bballCourt\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert basketballName != null : "fx:id=\"basketballName\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert basketballOverall != null : "fx:id=\"basketballOverall\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert basketballPosition != null : "fx:id=\"basketballPosition\" was not injected: check your FXML file 'BasketballCard.fxml'.";
        assert soccerName != null : "fx:id=\"soccerName\" was not injected: check your FXML file 'Soccer.fxml'.";
        assert soccerOverall != null : "fx:id=\"soccerOverall\" was not injected: check your FXML file 'Soccer.fxml'.";
        assert soccerPosition != null : "fx:id=\"soccerPosition\" was not injected: check your FXML file 'Soccer.fxml'.";
        assert footballName != null : "fx:id=\"footballName\" was not injected: check your FXML file 'Football.fxml'.";
        assert footballOverall != null : "fx:id=\"footballOverall\" was not injected: check your FXML file 'Football.fxml'.";
        assert footballPosition != null : "fx:id=\"footballPosition\" was not injected: check your FXML file 'Football.fxml'.";
        System.out.println(soccerName);
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

        //Basketball
        Pack testPack1 = new Pack();
        ArrayList<String[]> cardDrawn1 = testPack1.drawBasketballCard(true);
        String basketballCardName = cardDrawn1.get(0)[0];
        String basketballCardPosition = cardDrawn1.get(0)[1];
        String basketballCardOverall = cardDrawn1.get(0)[2];
        String basketballCardImage = testPack1.URLLink.get(0);


        basketballName = new Text();
        basketballPosition = new Text();
        basketballOverall = new Text();
        basketballName.setText(basketballCardName);
        basketballPosition.setText(basketballCardPosition);
        basketballOverall.setText(basketballCardOverall);

        basketballWindow.show();


        URL basketballURL= new URL(basketballCardImage);
        InputStream is1 = basketballURL.openStream();
        FileOutputStream fo1 = new FileOutputStream("src/main/resources/basketballpfp.jpg");
        int x = 0;
        while ((x = is1.read())!=-1) {
            fo1.write(x);
        }
        fo1.close();
        is1.close();

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

        //Football
        Pack testPack2 = new Pack();
        ArrayList<String[]> cardDrawn2 = testPack2.drawFootballCard(true);
        String footballCardName = cardDrawn2.get(0)[0];
        String footballCardPosition = cardDrawn2.get(0)[1];
        String footballCardOverall = cardDrawn2.get(0)[2];
        String footballCardImage = testPack2.URLLink.get(0);

        footballName.setText(footballCardName);
        footballPosition.setText(footballCardPosition);
        footballOverall.setText(footballCardOverall);

        URL footballURL= new URL(footballCardImage);
        InputStream is2 = footballURL.openStream();
        FileOutputStream fo2 = new FileOutputStream("src/main/resources/footballpfp.jpg");
        int y = 0;
        while ((y = is2.read())!=-1) {
            fo2.write(y);
        }
        fo2.close();
        is2.close();
    }

    @FXML
    /**
     * Changing scenes from soccer loading screen to soccer pack screen
     */
    public void packToSoccer(ActionEvent event) throws IOException {
        // Storing information about soccer
        Parent soccerParent = FXMLLoader.load(getClass().getResource("/Soccer.fxml"));
        Scene soccerScene = new Scene(soccerParent);

        Pack testPack3 = new Pack();
        ArrayList<String[]> cardDrawn3 = testPack3.drawSoccerCard(true);
        String soccerCardName = cardDrawn3.get(0)[0];
        String soccerCardPosition = cardDrawn3.get(0)[1];
        String soccerCardOverall = cardDrawn3.get(0)[2];
        String soccerCardImage = testPack3.URLLink.get(0);

        Text soccerName = (Text) soccerScene.lookup("#soccerName");
        soccerName.setText(soccerCardName);
        Text soccerPosition = (Text) soccerScene.lookup("#soccerPosition");
        soccerPosition.setText(soccerCardPosition);
        Text soccerOverall = (Text) soccerScene.lookup("#soccerOverall");
        soccerOverall.setText(soccerCardOverall);
        Stage soccerWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();

        soccerWindow.setScene(soccerScene);
        soccerWindow.show();

        System.out.println(soccerName);




        System.out.println(soccerName);
        soccerPosition = new Text();
        soccerOverall = new Text();
        //soccerName.setText(soccerCardName);
        //soccerPosition.setText(soccerCardPosition);
        //soccerOverall.setText(soccerCardOverall);
        //soccerWindow.show();

        //Soccer


        URL soccerURL= new URL(soccerCardImage);
        InputStream is3 = soccerURL.openStream();

        FileOutputStream fo3 = new FileOutputStream("src/main/resources/soccerpfp.jpg");
        int z = 0;
        while ((z = is3.read())!=-1) {
            fo3.write(z);
        }
        fo3.close();
        is3.close();

    }
}

