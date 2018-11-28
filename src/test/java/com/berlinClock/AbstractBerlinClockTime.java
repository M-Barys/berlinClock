package com.berlinClock;

public class AbstractBerlinClockTime {
    private int hours;
    private int minutes;
    private int seconds;
    private String berlinClockTime;

    public String checkTime(String actualTime) {

        hours = Integer.valueOf(actualTime.substring(0, 2));
        minutes = Integer.valueOf(actualTime.substring(3, 5));
        seconds = Integer.valueOf(actualTime.substring(6));

        BerlinClock berlinClock = new BerlinClock();

        return berlinClockTime = berlinClock.secLamp(seconds) + berlinClock.fiveHourRow(hours)
                + berlinClock.singleHoursRow(hours) + berlinClock.fiveMinuteRow(minutes)
                + berlinClock.singleMinuteRow(minutes);
    }
}
