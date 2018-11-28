package com.berlinClock;


import org.junit.Assert;
import org.junit.Test;

public class SecLampTest {
    private final String secondsY = "Y";
    private final String secondsO = "O";


    @Test
    public void secLampR1() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(secondsY, berlinClock.secLamp(0));

    }

    @Test
    public void secLampO2() {

        BerlinClock berlinClock = new BerlinClock();
        Assert.assertEquals(secondsO, berlinClock.secLamp(59));

    }

}
