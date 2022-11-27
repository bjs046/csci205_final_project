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
     * goes through array list of overalls and finds the card's overall rating
     * @return integer value of card's rating
     */
    private int findOverall() {
        //TODO - read in data file associated with sport and find card's overall
        return 0;
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
     * sorts the array lists of sports card overalls by rating highest to lowest
     */
    public void sortOverall(){
        //TODO - sort all three array lists from highest to lowest
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

    //    public static void main(String[] args){
//        Card a = new Card(Sport.BASKETBALL);
//        System.out.println(a.cardSport);
//        a.fillSoccerList();
//    }
}
