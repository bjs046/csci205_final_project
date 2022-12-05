package org.final_project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    public Card testCard;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        testCard = new Card(Sport.FOOTBALL);
    }

    @Test
    void addOverall(){
        FootballCard list = new FootballCard();
        list.fillFootballList();
        CustomCard testCustCard = new CustomCard(Sport.FOOTBALL, "QB", "Test", "99");
        testCustCard.addOverall(testCustCard);
        assertEquals(list.getOverallListFootball().get(99)[2],"99");
    }

    @Test
    void getCardSport() {
        assertEquals(testCard.getCardSport(),Sport.FOOTBALL);
    }
}