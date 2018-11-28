package com.berlinClock;


import org.junit.Assert;
import org.junit.Test;

public class FiveHourRowTest {
    private final String fiveHourRowOOOO = "OOOO";
    private final String fiveHourRowRRRR = "RRRR";
    private final String fiveHourRowROOO = "ROOO";
    private final String fiveHourRowRRRO = "RRRO";


    @Test
    public void fiveHourRow1() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(fiveHourRowOOOO, berlinClock.fiveHourRow(0));

    }

    @Test
    public void fiveHourRow2() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(fiveHourRowRRRR, berlinClock.fiveHourRow(23));

    }

    @Test
    public void fiveHourRow3() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(fiveHourRowOOOO, berlinClock.fiveHourRow(2));

    }

    @Test
    public void fiveHourRow4() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(fiveHourRowROOO, berlinClock.fiveHourRow(8));

    }

    @Test
    public void fiveHourRow5() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(fiveHourRowRRRO, berlinClock.fiveHourRow(16));

    }

}
