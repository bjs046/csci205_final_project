/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Junior Weil, Brandon, Brian, Joseph
 * Section: 02 - 11 AM
 * Date: 11/11/22
 * Time: 10:32 AM
 *
 * Project: csci205_final_project
 * Package: org.final_project
 * Class: Card
 *
 * Description: Parent class for our card objects
 *
 * ****************************************
 */
package org.final_project;

import javafx.scene.image.Image;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Card {

    /** enumeration sport of the card */
    private Sport cardSport;

    /** image that will cover the card */
    public Image cardImage;

    /**
     * constructor for card object
     * @param cardSport selected sport for the card
     */
    public Card(Sport cardSport) {
        this.cardSport = cardSport;
    }

    /**
     * goes through array list of players and finds the image of the player's card
     * @return image of the player's card
     */
    private Image findImage() {
        //TODO - read in data file associated with sport and find card's image
        return null;
    }

    /**
     * used for adding a custom card's overall to the array list for the pack openings
     */
    public void addOverall(CustomCard newCard) {
        //check the card type and add to the appropriate list
        if (newCard.getCardSport().equals(Sport.BASKETBALL)) {
            String[] addCard = {newCard.getFullName(), newCard.getPosition()};
            BasketballCard.getOverallListBasketball().add(addCard);
        } else if (newCard.getCardSport().equals(Sport.SOCCER)) {
            String[] addCard = {newCard.getFullName(), newCard.getPosition()};
            SoccerCard.getOverallListSoccer().add(addCard);
        }else{
            String[] addCard = {newCard.getFullName(), newCard.getPosition()};
            FootballCard.getOverallListFootball().add(addCard);
        }
    }

    public void setCardSport(Sport cardSport) {
        this.cardSport = cardSport;
    }

    public Sport getCardSport() {
        return cardSport;
    }

    /** Method to test the class*/
    public static void main(String[] args){
        BasketballCard a = new BasketballCard();
        //System.out.println(a.cardSport);
        //a.addOverall(new CustomCard(Sport.BASKETBALL,"PG","Junior"));
        System.out.println(a);
    }
    

}
