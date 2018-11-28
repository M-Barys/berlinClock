package com.berlinClock;


import org.junit.Assert;
import org.junit.Test;

public class SingleHourRowTest {
    private final String singleHourRowOOOO = "OOOO";
    private final String singleHourRowRRRO = "RRRO";
    private final String singleHourRowRROO = "RROO";
    private final String singleHourRowRRRR = "RRRR";


    @Test
    public void singleHourRow1() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(singleHourRowOOOO, berlinClock.singleHoursRow(0));

    }

    @Test
    public void singleHourRow2() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(singleHourRowRRRO, berlinClock.singleHoursRow(23));

    }

    @Test
    public void singleHourRow3() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(singleHourRowRROO, berlinClock.singleHoursRow(2));

    }

    @Test
    public void singleHourRow4() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(singleHourRowRRRO, berlinClock.singleHoursRow(8));

    }

    @Test
    public void singleHourRow5() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(singleHourRowRRRR, berlinClock.singleHoursRow(14));

    }

}
