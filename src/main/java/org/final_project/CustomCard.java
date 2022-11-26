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
 * Class: CustomCard
 *
 * Description:
 *
 * ****************************************
 */
package org.final_project;

public class CustomCard extends Card{
    /** team name */
    String team;

    /** player's full name */
    String fullName;

    /** player's position */
    String position;

    /**
     * constructor for card object
     *
     * @param cardSport selected sport for the card
     */
    public CustomCard(Sport cardSport) {
        super(cardSport);
    }

    /**
     * used for adding a custom card's overall to the array list for the pack openings
     */
    public void addOverall() {
        //TODO - add new overall for custom cards to the list of overalls
    }
}