/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Junior Weil, Joseph Helm, Brian Scotto, Brandon Cho
 * Section: 02 - 11 AM
 * Date: 11/15/22
 * Time: 11:26 AM
 *
 * Project: csci205_final_project
 * Package: org.final_project
 * Class: SoccerCard
 *
 * Description:
 *
 * ****************************************
 */
package org.final_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.final_project.Sport.SOCCER;

public class SoccerCard extends Card{
    /** static array list of overalls for soccer cards */
    private static ArrayList<String[]> overallListSoccer = new ArrayList<>();

    /** name of data file for soccer cards */
    private static final String soccerDataFile = "src/main/java/org/final_project/players_22.csv";

    public static ArrayList<String[]> getOverallListSoccer() {
        return overallListSoccer;
    }

    /**
     *Soccer card constructor automatically sets card enum to soccer
     */
    public SoccerCard() {
        super(SOCCER);
    }

    /**
     * read in soccer data file and fill list with all the cards' overalls
     */
    public static void fillSoccerList(){
        //TODO - buffered reader and split the list with comma delimiter and add all the overalls to the
        //appropriate list
        File file = new File(soccerDataFile);
        ArrayList<String[]> playerList = new ArrayList<>();
        try {
            Scanner scnr = new Scanner(file);
            // Getting rid of the first line (which is the legend)
            scnr.nextLine();
            int x = 0;
            while (scnr.hasNext()&&x<100) {
                String wholeLine = scnr.nextLine();
                playerList.add(wholeLine.split(","));
                //name, position, overall
                String[] addedValues = {playerList.get(x)[2], playerList.get(x)[4], playerList.get(x)[5]};
                overallListSoccer.add(addedValues);
                System.out.println(overallListSoccer.get(x)[0] + " " + overallListSoccer.get(x)[1] + " " + overallListSoccer.get(x)[2]);
                x++;

            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    /**
     * used for adding a custom card's overall to the array list for the pack openings
     */
    public void addOverall(CustomCard newCard) {
        String[] addCard = {newCard.getFullName(), newCard.getPosition(), String.valueOf(newCard.getOverall())};
        overallListSoccer.add(addCard);
    }

    public static void main(String[] args){
        SoccerCard a = new SoccerCard();
        a.fillSoccerList();
//        a.addOverall(new CustomCard(SOCCER));
//        System.out.println(overallListSoccer.get(99)[1]);
    }
}