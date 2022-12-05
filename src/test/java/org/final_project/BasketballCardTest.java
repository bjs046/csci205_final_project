package org.final_project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketballCardTest {

    private BasketballCard test;
    @BeforeEach
    void setUp() {
        test = new BasketballCard();
        test.fillBasketballList();
    }

    @Test
    void getOverallListBasketball() {
        String[] testArray = {"Goran Dragic", "G", "79"};
        assertEquals(test.getOverallListBasketball().get(98)[0],testArray[0]);
        assertEquals(test.getOverallListBasketball().get(98)[1],testArray[1]);
        assertEquals(test.getOverallListBasketball().get(98)[2],testArray[2]);
    }
}