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

import java.util.ArrayList;

import static org.final_project.Sport.BASKETBALL;

public class BasketballCard extends Card{
    /** static array list of overalls for basketball cards */
    private static ArrayList<Card> overallListBasketball;

    /** name of data file for basketball cards */
    private static final String basketballDataFile = "src/main/java/org/final_project/nba2k-full.csv";

    public static ArrayList<Card> getOverallListBasketball() {
        return overallListBasketball;
    }

    /**
     *Basketball card constructor automatically sets card enum to basketball
     */
    public BasketballCard() {
        super(BASKETBALL);
    }
}