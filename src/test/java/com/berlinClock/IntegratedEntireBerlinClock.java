package com.berlinClock;

import org.junit.Assert;
import org.junit.Test;

public class IntegratedEntireBerlinClock extends AbstractBerlinClockTime {
    private final String checkTime1 = "YOOOOOOOOOOOOOOOOOOOOOOO";
    private final String checkTime2 = "ORRRRRRROYYRYYRYYRYYYYYY";
    private final String checkTime3 = "YRRROROOOYYRYYRYYRYOOOOO";
    private final String checkTime4 = "ORROOROOOYYRYYRYOOOOYYOO";


    @Test
    public void checkTime1() {
        Assert.assertEquals(checkTime1, checkTime("00:00:00"));
        System.out.println(checkTime("00:00:00") + "     00:00:00");
    }

    @Test
    public void checkTime2() {
        Assert.assertEquals(checkTime2, checkTime("23:59:59"));
        System.out.println(checkTime("23:59:59") + "     23:59:59");
    }

    @Test
    public void checkTime3() {
        Assert.assertEquals(checkTime3, checkTime("16:50:06"));
        System.out.println(checkTime("16:50:06") + "     16:50:06");
    }

    @Test
    public void checkTime4() {
        Assert.assertEquals(checkTime4, checkTime("11:37:01"));
        System.out.println(checkTime("11:37:01") + "     11:37:01");
    }
}
