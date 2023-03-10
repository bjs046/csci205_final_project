/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Junior Weil, Joseph Helm, Brian Scotto, Brandon Cho
 * Section: 02 - 11 AM
 * Date: 11/15/22
 * Time: 11:25 AM
 *
 * Project: csci205_final_project
 * Package: org.final_project
 * Class: FootballCard
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

import static org.final_project.Sport.FOOTBALL;

public class FootballCard extends Card{

    /** static array list of overalls for football cards */
    private static ArrayList<String[]> overallListFootball = new ArrayList<>();

    /** name of data file for football cards */
    private static final String footballDataFile = "src/main/java/org/final_project/madden21_ratings.csv";

    public static ArrayList<String[]> getOverallListFootball() {
        return overallListFootball;
    }

    /**
     *Football card constructor automatically sets card enum to football
     */
    public FootballCard() {
        super(FOOTBALL);
    }

    /**
     * read in soccer data file from pathway and fills array list with all the cards' overalls.  It splits
     * the line in the data file into an array then we access the indices with the information we need to then
     * copy over into the array list with all the other players
     */
    public static void fillFootballList(){
        File file = new File(footballDataFile);
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
                String[] addedValues = {playerList.get(x)[1], playerList.get(x)[3], playerList.get(x)[2]};
                overallListFootball.add(addedValues);
                x++;

            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}