package ru.eit.ps_java.eugenBorisov.lesson1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    final String titanicCrash = "1912",
            milenium = "2000 г.",
            next = "2024", first = "1764", last21 = "2096";
    String[] leap = new String[] {titanicCrash, milenium, next, first, last21,
            "1600", "2016"};
    String[] unLeap = new String[] {"1700", "1800", "1900", "2100", "2200", "2300",
            "1911", "1913", "1999", "2001", "2023", "2025", "1763", "1765", "2095", "2097"};

    @Test
    public void testDoTask4() {
        for(String year:leap){
            String[] splitMsg = Main.doTask4(year).split(" ");
            assertTrue(splitMsg.length>0);
            assertEquals(splitMsg[splitMsg.length-1],"29");
        }
        for(String year:unLeap){
            String[] splitMsg = Main.doTask4(year).split(" ");
            assertTrue(splitMsg.length>0);
            assertEquals(splitMsg[splitMsg.length-1],"28");
        }
    }
}