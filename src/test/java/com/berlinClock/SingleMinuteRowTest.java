package com.berlinClock;


import org.junit.Assert;
import org.junit.Test;

public class SingleMinuteRowTest {
    private final String OneMinuteRowOOOO = "OOOO";
    private final String OneMinuteRowYYYY = "YYYY";
    private final String OneMinuteRowYYOO = "YYOO";


    @Test
    public void singleMinuteRowOOOO1() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(OneMinuteRowOOOO, berlinClock.oneMinuteRow(0));

    }

    @Test
    public void singleMinuteRowYYYY2() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(OneMinuteRowYYYY, berlinClock.oneMinuteRow(59));

    }

    @Test
    public void singleMinuteRowYYOO3() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(OneMinuteRowYYOO, berlinClock.oneMinuteRow(32));

    }

    @Test
    public void singleMinuteRowYYYY4() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(OneMinuteRowYYYY, berlinClock.oneMinuteRow(34));

    }

    @Test
    public void singleMinuteRowOOOO5() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(OneMinuteRowOOOO, berlinClock.oneMinuteRow(35));

    }

}
