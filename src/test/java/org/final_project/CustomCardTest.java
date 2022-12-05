package org.final_project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomCardTest {

    private CustomCard test;
    @BeforeEach
    void setUp() {
        test = new CustomCard(Sport.BASKETBALL, "PG", "Test", "99");
    }

    @Test
    void getFullName() {
        assertEquals(test.getFullName(),"Test");
    }

    @Test
    void getPosition() {
        assertEquals(test.getPosition(),"PG");
    }

    @Test
    void getOverall() {
        assertEquals(test.getOverall(),"99");
    }
}