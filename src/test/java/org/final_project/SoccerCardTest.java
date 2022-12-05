package org.final_project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoccerCardTest {

    private SoccerCard test;
    @BeforeEach
    void setUp() {
        test = new SoccerCard();
        test.fillSoccerList();
    }

    @Test
    void getOverallListSoccer() {
        String[] testArray = {"Jesús Navas", "RB", "84"};
        assertEquals(test.getOverallListSoccer().get(98)[0],testArray[0]);
        assertEquals(test.getOverallListSoccer().get(98)[1],testArray[1]);
        assertEquals(test.getOverallListSoccer().get(98)[2],testArray[2]);
    }
}