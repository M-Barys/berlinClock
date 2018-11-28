package com.berlinClock;

import org.junit.Assert;
import org.junit.Test;

public class FiveMinuteRowTest {
    private final String fiveMinuteRow1 = "OOOOOOOOOOO";
    private final String fiveMinuteRow2 = "YYRYYRYYRYY";
    private final String fiveMinuteRow3 = "OOOOOOOOOOO";
    private final String fiveMinuteRow4 = "YYRYOOOOOOO";
    private final String fiveMinuteRow5 = "YYRYYRYOOOO";

    @Test
    public void fiveMinuteRow1() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(fiveMinuteRow1, berlinClock.fiveMinuteRow(00));

    }

    @Test
    public void fiveMinuteRow2() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(fiveMinuteRow2, berlinClock.fiveMinuteRow(59));

    }

    @Test
    public void fiveMinuteRow3() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(fiveMinuteRow3, berlinClock.fiveMinuteRow(04));

    }

    @Test
    public void fiveMinuteRow4() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(fiveMinuteRow4, berlinClock.fiveMinuteRow(23));

    }

    @Test
    public void fiveMinuteRow5() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(fiveMinuteRow5, berlinClock.fiveMinuteRow(35));

    }
}
