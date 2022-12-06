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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pack {

    /** instance of pack so we can use a singleton design patter */
    public static Pack instance;

    ArrayList<String[]> soccerPlayers;
    ArrayList<String[]> basketballPlayers;
    ArrayList<String[]> footballPlayers;

    ArrayList<String> soccerImageList;
    ArrayList<String> basketballImageList;
    ArrayList<String> footballImageList;

    ArrayList<String> URLLink;

    /** random object for card drawcard methods*/
    public Random rand;

    public static Pack getinstance(){
        if (instance == null) {
            try {
                instance = new Pack();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            return instance;
        }
        else {
            return instance;
        }
    }

    /**
     * Pack object constructor.  creates a new random object that is used in the random card generator methods
     * then creates new sports card objects for all three sports so that we can fill the lists.  Then we clone the
     * the lists and generate then image lists for all three sports
     *
     * @throws FileNotFoundException
     */
    public Pack() throws FileNotFoundException {
        rand = new Random();
        SoccerCard soccerCard1 = new SoccerCard();
        BasketballCard basketballCard1 = new BasketballCard();
        FootballCard footballCard1 = new FootballCard();

        soccerCard1.fillSoccerList();
        basketballCard1.fillBasketballList();
        footballCard1.fillFootballList();

        soccerPlayers = soccerCard1.getOverallListSoccer();
        basketballPlayers = basketballCard1.getOverallListBasketball();
        footballPlayers = footballCard1.getOverallListFootball();

        soccerImageList = getImageURL("soccer");
        basketballImageList = getImageURL("basketball");
        footballImageList = getImageURL("football");
    }

    /**
     * getImageURL method that returns an ArrayList of strings. There are URLs that are in the
     * same order as cards for each sport and are used to display the images on the card
     *
     * @param sport
     * @return list of Strings that are the URLs to images in the same order as the cards
     * @throws FileNotFoundException
     */
    public ArrayList<String> getImageURL(String sport) throws FileNotFoundException {
        sport.toLowerCase();
        File soccerFile = new File("src/main/java/org/final_project/SoccerImages.txt");
        File basketballFile = new File("src/main/java/org/final_project/BasketballImages.txt");
        File footballFile = new File("src/main/java/org/final_project/FootballImages.txt");
        Scanner scnr;
        ArrayList<String> returnList = new ArrayList<>();
        if (sport.equals("soccer")){
            scnr = new Scanner(soccerFile);
            while (scnr.hasNext()) {
                String url = scnr.nextLine();
                returnList.add(url);
            }
        }
        else if (sport.equals("basketball")){
            scnr = new Scanner(basketballFile);
            while (scnr.hasNext()) {
                String url = scnr.nextLine();
                returnList.add(url);
            }
        }
        else if (sport.equals("football")){
            scnr = new Scanner(footballFile);
            while (scnr.hasNext()) {
                String url = scnr.nextLine();
                returnList.add(url);
            }
        }
        return returnList;
    }

    /**
     * generates random number and selects card at that index in the soccer list
     * @return randomly selected card for pack
     */
    public ArrayList<String[]> drawSoccerCard(boolean oneCard) {
        //generate random number to select card from overall list
        int randValue = rand.nextInt(soccerPlayers.size() - 1);
        ArrayList<String[]> packCard = new ArrayList<>();
        ArrayList<String> packImage = new ArrayList<>();
        //Fill array with one card
        if (oneCard == true) {
            packCard.add(soccerPlayers.get(randValue));
            packImage.add(soccerImageList.get(randValue));
            URLLink = packImage;
            return packCard;
        }
        //Fill array with three cards
        else {
            packCard.add(soccerPlayers.get(randValue));
            packImage.add(soccerImageList.get(randValue));
            randValue = rand.nextInt(soccerPlayers.size() - 1);
            packCard.add(soccerPlayers.get(randValue));
            packImage.add(soccerImageList.get(randValue));
            randValue = rand.nextInt(soccerPlayers.size() - 1);
            packCard.add(soccerPlayers.get(randValue));
            packImage.add(soccerImageList.get(randValue));
            URLLink = packImage;
            return packCard;
        }
    }

    /**
     * generates random number and selects card at that index in the football list
     * @return randomly selected card for pack
     */
    public ArrayList<String[]> drawFootballCard(boolean oneCard) {
        //generate random number to select card from overall list
        int randValue = rand.nextInt(footballPlayers.size() - 1);
        ArrayList<String[]> packCard = new ArrayList<>();
        ArrayList<String> packImage = new ArrayList<>();
        //Fill array with one card
        if (oneCard == true) {
            packCard.add(footballPlayers.get(randValue));
            packImage.add(footballImageList.get(randValue));
            URLLink = packImage;
            return packCard;
        }
        //Fill array with three cards
        else {
            packCard.add(footballPlayers.get(randValue));
            packImage.add(footballImageList.get(randValue));
            randValue = rand.nextInt(footballPlayers.size() - 1);
            packCard.add(footballPlayers.get(randValue));
            packImage.add(footballImageList.get(randValue));
            randValue = rand.nextInt(footballPlayers.size() - 1);
            packCard.add(footballPlayers.get(randValue));
            packImage.add(footballImageList.get(randValue));
            URLLink = packImage;
            return packCard;
        }
    }

    /**
     * generates random number and selects card at that index in the basketball list
     * @return randomly selected card for pack
     */
    public ArrayList<String[]> drawBasketballCard(boolean oneCard) {
        //generate random number to select card from overall list
        int randValue = rand.nextInt(basketballPlayers.size() - 1);
        ArrayList<String[]> packCard = new ArrayList<>();
        ArrayList<String> packImage = new ArrayList<>();
        //Fill array with one card
        if (oneCard == true) {
            packCard.add(basketballPlayers.get(randValue));
            packImage.add(basketballImageList.get(randValue));
            URLLink = packImage;
            return packCard;
        }
        //Fill array with three cards
        else {
            packCard.add(basketballPlayers.get(randValue));
            packImage.add(basketballImageList.get(randValue));
            randValue = rand.nextInt(basketballPlayers.size() - 1);
            packCard.add(basketballPlayers.get(randValue));
            packImage.add(basketballImageList.get(randValue));
            randValue = rand.nextInt(basketballPlayers.size() - 1);
            packCard.add(basketballPlayers.get(randValue));
            packImage.add(basketballImageList.get(randValue));
            URLLink = packImage;
            return packCard;
        }
    }

    public static void main(String[] args) throws IOException{
        /**
        Pack testPack = new Pack();
        System.out.println(testPack.drawFootballCard(true).get(0)[0]);
        System.out.println(testPack.URLLink.get(0));
        System.out.println(testPack.drawFootballCard(true).get(0)[0]);
        System.out.println(testPack.URLLink.get(0));
         */


        Pack testPack = new Pack();
        System.out.println(testPack.drawFootballCard(true).get(0)[0]);
        System.out.println(testPack.URLLink.get(0));
        System.out.println(testPack.drawFootballCard(true).get(0)[0]);
        System.out.println(testPack.URLLink.get(0));

    }
}