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
 * Class: BasketballCard
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

import static org.final_project.Sport.BASKETBALL;

public class BasketballCard extends Card{
    /** static array list of overalls for basketball cards */
    private static ArrayList<String[]> overallListBasketball = new ArrayList<>();

    /** name of data file for basketball cards */
    private static final String basketballDataFile = "src/main/java/org/final_project/nba2k-full.csv";

    public static ArrayList<String[]> getOverallListBasketball() {
        return overallListBasketball;
    }

    /**
     *Basketball card constructor automatically sets card enum to basketball
     */
    public BasketballCard() {
        super(BASKETBALL);

    }

    public static void fillBasketballList(){
        //TODO - buffered reader and split the list with comma delimiter and add all the overalls to the
        //appropriate list
        File file = new File(basketballDataFile);
        ArrayList<String[]> playerList = new ArrayList<>();
        try {
            Scanner scnr = new Scanner(file);
            // Getting rid of the first line (which is the legend)
            scnr.nextLine();
            int x = 0;
            while (scnr.hasNext()&&x<100) {
                String wholeLine = scnr.nextLine();
                playerList.add(wholeLine.split(","));
                String[] addedValues = {playerList.get(x)[0], playerList.get(x)[4], playerList.get(x)[1]};
                overallListBasketball.add(addedValues);
                System.out.println(overallListBasketball.get(x)[0] + " " + overallListBasketball.get(x)[1] + " " + overallListBasketball.get(x)[2]);
                x++;

            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        BasketballCard a = new BasketballCard();
        a.fillBasketballList();
    }
}