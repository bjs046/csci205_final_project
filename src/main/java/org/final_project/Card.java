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

import java.util.ArrayList;

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

    /** static array list of overalls for soccer cards */
    private static ArrayList<Integer> overallListSoccer;

    /** static array list of overalls for football cards */
    private static ArrayList<Integer> overallListFootball;

    /** static array list of overalls for basketball cards */
    private static ArrayList<Integer> overallListBasketball;

    /** name of data file for soccer cards */
    private static final String soccerDataFile = "/players_22.csv";

    /** name of data file for football cards */
    private static final String footballDataFile = "/madden21_ratings.csv";

    /** name of data file for basketball cards */
    private static final String basketballDataFile = "/nba2k_full.csv";

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
     * used for adding a custom card's overall to the array list for the pack openings
     */
    public void addOverall() {
        //TODO - add new overall for custom cards to the list of overalls
    }

    /**
     * sorts the array lists of sports card overalls by rating highest to lowest
     */
    public void sortOverall(){
        //TODO - sort all three array lists from highest to lowest
    }

    /**
     * read in soccer data file and fill list with all the cards' overalls
     */
    public void fillSoccerList(){
        //TODO - buffered reader and split the list with comma delimiter and add all the overalls to the
        //appropriate list
    }

    /**
     * read in football data file and fill list with all the cards' overalls
     */
    public void fillFootballList(){
        //TODO - buffered reader and split the list with comma delimiter and add all the overalls to the
        //appropriate list
    }

    /**
     * read in basketball data file and fill list with all the cards' overalls
     */
    public void fillBasketballList(){
        //TODO - buffered reader and split the list with comma delimiter and add all the overalls to the
        //appropriate list
    }
}