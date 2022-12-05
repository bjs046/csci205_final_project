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
 * Class: CustomCard
 *
 * Description:
 *
 * ****************************************
 */
package org.final_project;

public class CustomCard extends Card{

    /** player's full name */
    private String fullName;

    /** player's position */
    private String position;

    /** player's overall */
    private String overall;

    /**
     * constructor for card object.
     * @param cardSport passes the sport of the card to the super constructor
     * @param pos position of the custom player card
     * @param name name of the custom card
     * @param overall overall of the custom card
     */
    public CustomCard(Sport cardSport, String pos, String name, String overall) {
        super(cardSport);
        this.position = pos;
        this.fullName = name;
        this.overall = overall;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getOverall() {
        return overall;
    }
}