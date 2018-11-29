package com.berlinClock;

import org.junit.Assert;
import org.junit.Test;

public class IntegratedEntireBerlinClock {
    private final String checkTime1 = "YOOOOOOOOOOOOOOOOOOOOOOO";
    private final String checkTime2 = "ORRRRRRROYYRYYRYYRYYYYYY";
    private final String checkTime3 = "YRRROROOOYYRYYRYYRYOOOOO";
    private final String checkTime4 = "ORROOROOOYYRYYRYOOOOYYOO";


    @Test
    public void checkTime1() {
        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(checkTime1, berlinClock.checkTime("00:00:00"));
        System.out.println(berlinClock.checkTime("00:00:00") + "     00:00:00");
    }

    @Test
    public void checkTime2() {
        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(checkTime2, berlinClock.checkTime("23:59:59"));
        System.out.println(berlinClock.checkTime("23:59:59") + "     23:59:59");
    }

    @Test
    public void checkTime3() {
        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(checkTime3, berlinClock.checkTime("16:50:06"));
        System.out.println(berlinClock.checkTime("16:50:06") + "     16:50:06");
    }

    @Test
    public void checkTime4() {
        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(checkTime4, berlinClock.checkTime("11:37:01"));
        System.out.println(berlinClock.checkTime("11:37:01") + "     11:37:01");
    }
}
