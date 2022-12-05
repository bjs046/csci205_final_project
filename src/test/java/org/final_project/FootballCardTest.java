package org.final_project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballCardTest {

    private FootballCard test;
    @BeforeEach
    void setUp() {
        test = new FootballCard();
        test.fillFootballList();
    }

    @Test
    void getOverallListFootball() {
        String[] testArray = {"A.J. Green", "WR", "88"};
        assertEquals(test.getOverallListFootball().get(98)[0],testArray[0]);
        assertEquals(test.getOverallListFootball().get(98)[1],testArray[1]);
        assertEquals(test.getOverallListFootball().get(98)[2],testArray[2]);
    }
}