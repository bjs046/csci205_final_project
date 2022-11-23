/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Junior Weil
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

import java.util.ArrayList;

public class FootballCard extends CustomCard{

    /** static array list of overalls for football cards */
    private static ArrayList<Card> overallListFootball;

    /** name of data file for football cards */
    private static final String footballDataFile = "/madden21_ratings.csv";

    public static ArrayList<Card> getOverallListFootball() {
        return overallListFootball;
    }
}