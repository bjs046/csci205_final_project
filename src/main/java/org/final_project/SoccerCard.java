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
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import static java.lang.Integer.parseInt;
import static org.final_project.Sport.SOCCER;

public class SoccerCard extends Card{
    /** static array list of overalls for soccer cards */
    private static ArrayList<String[]> overallListSoccer = new ArrayList<>();

    /** name of data file for soccer cards */
    private static final String soccerDataFile = "src/main/java/org/final_project/soccerfile.csv";


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
     * read in soccer data file from pathway and fills array list with all the cards' overalls.  It splits
     * the line in the data file into an array then we access the indices with the information we need to then
     * copy over into the array list with all the other players
     */
    public static void fillSoccerList(){
        //appropriate data file
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
                String[] addedValues = {playerList.get(x)[2], playerList.get(x)[4], playerList.get(x)[5]};
                overallListSoccer.add(addedValues);
                x++;

            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}