/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 *
 * Name: Junior Weil
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

import java.util.ArrayList;

public class SoccerCard {
    /** static array list of overalls for soccer cards */
    private static ArrayList<Card> overallListSoccer;

    /** name of data file for soccer cards */
    private static final String soccerDataFile = "/players_22.csv";

    public static ArrayList<Card> getOverallListSoccer() {
        return overallListSoccer;
    }
}