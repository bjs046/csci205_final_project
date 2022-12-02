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

import static org.final_project.BasketballCard.fillBasketballList;

/**
 * the different states of sports that a card can be
 */
enum Sport {
    BASKETBALL,     //Card sport is basketball
    FOOTBALL,     //Card sport is football
    SOCCER     //Card sport is soccer
}

public class Card {

    /** enumeration sport of the card */
    private Sport cardSport;

    /** image that will cover the card */
    public Image cardImage;

    /** rating of the card */
    public int overall;

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
        if (newCard.getCardSport().equals(Sport.BASKETBALL)) {
            String[] addCard = {newCard.getFullName(), newCard.getPosition(), String.valueOf(newCard.getOverall())};
            BasketballCard.getOverallListBasketball().add(addCard);
        }else if (newCard.getCardSport().equals(Sport.FOOTBALL)){
            String[] addCard = {newCard.getFullName(), newCard.getPosition(), String.valueOf(newCard.getOverall())};
            FootballCard.getOverallListFootball().add(addCard);
        }else {
            String[] addCard = {newCard.getFullName(), newCard.getPosition(), String.valueOf(newCard.getOverall())};
            SoccerCard.getOverallListSoccer().add(addCard);
        }
   }

    public int getOverall() {
        return overall;
    }

    public void setCardSport(Sport cardSport) {
        this.cardSport = cardSport;
    }

    public Sport getCardSport() {
        return cardSport;
    }

    public static void main(String[] args){
        CustomCard a = new CustomCard(Sport.BASKETBALL, "PG", "Junior");
        BasketballCard b = new BasketballCard();
        fillBasketballList();
        a.addOverall(a);
        for (int i = 0; i < b.getOverallListBasketball().size(); i++) {
            System.out.println(i + ": " + b.getOverallListBasketball().get(i)[0] + " " + b.getOverallListBasketball().get(i)[1]
            + " " + b.getOverallListBasketball().get(i)[2]);
        }
    }
    

}
