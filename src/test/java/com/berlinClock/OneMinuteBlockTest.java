package com.berlinClock;


import org.junit.Assert;
import org.junit.Test;

public class OneMinuteBlockTest {
    private final String OneMinuteBlockOOOO = "OOOO";
    private final String OneMinuteBlockYYYY = "YYYY";
    private final String OneMinuteBlockYYOO = "YYOO";


    @Test
    public void singleMinuteRowOOOO1() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(OneMinuteBlockOOOO, berlinClock.oneMinuteBlock(00));

    }

    @Test
    public void singleMinuteRowYYYY2() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(OneMinuteBlockYYYY, berlinClock.oneMinuteBlock(59));

    }

    @Test
    public void singleMinuteRowYYOO3() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(OneMinuteBlockYYOO, berlinClock.oneMinuteBlock(32));

    }

    @Test
    public void singleMinuteRowYYYY4() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(OneMinuteBlockYYYY, berlinClock.oneMinuteBlock(34));

    }

    @Test
    public void singleMinuteRowOOOO5() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(OneMinuteBlockOOOO, berlinClock.oneMinuteBlock(35));

    }

}
