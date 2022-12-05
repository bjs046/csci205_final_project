package org.final_project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

class PackTest {

    private Pack test;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        test = new Pack();
    }

    @Test
    void drawSoccerCard() throws FileNotFoundException {
        assertEquals(test.getImageURL("soccer"),test.soccerImageList);
    }

    @Test
    void drawFootballCard() throws FileNotFoundException {
        assertEquals(test.getImageURL("football"),test.footballImageList);
    }

    @Test
    void drawBasketballCard() throws FileNotFoundException {
        assertEquals(test.getImageURL("basketball"),test.basketballImageList);
    }
}