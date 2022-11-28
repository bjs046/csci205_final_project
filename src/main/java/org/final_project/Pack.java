/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Junior Weil, Joseph Helm, Brian Scotto, Brandon Cho
 * Section: 02 - 11 AM
 * Date: 11/26/22
 * Time: 2:37 PM
 *
 * Project: csci205_final_project
 * Package: org.final_project
 * Class: Pack
 *
 * Description:
 *
 * ****************************************
 */
package org.final_project;

import java.util.ArrayList;
import java.util.Random;

public class Pack {
    // TODO - should we make this a singlton class?
    ArrayList<String[]> soccerPlayers;
    ArrayList<String[]> basketballPlayers;
    ArrayList<String[]> footballPlayers;

    public Pack() {
        SoccerCard soccerCard1 = new SoccerCard();
        BasketballCard basketballCard1 = new BasketballCard();
        FootballCard footballCard1 = new FootballCard();

        soccerCard1.fillSoccerList();
        basketballCard1.fillBasketballList();
        footballCard1.fillFootballList();

        soccerPlayers = soccerCard1.getOverallListSoccer();
        basketballPlayers = basketballCard1.getOverallListBasketball();
        footballPlayers = footballCard1.getOverallListFootball();
    }

    /**
     * generates random number and selects card at that index in the soccer list
     * @return randomly selected card for pack
     */
    public String[] drawSoccerCard() {
        Random rand = new Random();
        int randValue = rand.nextInt(soccerPlayers.size() - 1);

        return soccerPlayers.get(randValue);
    }

    /**
     * generates random number and selects card at that index in the football list
     * @return randomly selected card for pack
     */
    public String[] drawFootballCard() {
        Random rand = new Random();
        int randValue = rand.nextInt(footballPlayers.size()-1);

        return footballPlayers.get(randValue);
    }

    /**
     * generates random number and selects card at that index in the basketball list
     * @return randomly selected card for pack
     */
    public ArrayList<String[]> drawBasketballCard(boolean oneCard) {
        //generate random number to select card from overall list
        Random rand = new Random();
        int randValue = rand.nextInt(basketballPlayers.size() - 1);
        ArrayList<String[]> packCard = new ArrayList<>();
        //Fill array with one card
        if (oneCard == true) {
            packCard.add(basketballPlayers.get(randValue));
            return packCard;
        }
        //Fill array with three cards
        else {
            packCard.add(basketballPlayers.get(randValue));
            randValue = rand.nextInt(basketballPlayers.size() - 1);
            packCard.add(basketballPlayers.get(randValue));
            randValue = rand.nextInt(basketballPlayers.size() - 1);
            packCard.add(basketballPlayers.get(randValue));
            return packCard;
        }
    }

}