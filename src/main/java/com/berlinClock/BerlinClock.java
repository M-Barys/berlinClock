package com.berlinClock;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor

public class BerlinClock {
    int minutesMod;
    String minutesBlock = "OOOO";
    String currentMinuteBlock = new String("OOOO");

    public String oneMinuteBlock(int minutes) {
        minutesMod = minutes%5;
        if(minutesMod < 5) {
            for (int i = 0; i < minutesMod; i++) {
                currentMinuteBlock = currentMinuteBlock.substring(0, i) + "Y" + minutesBlock.substring(i + 1);
            }
        }
        return  currentMinuteBlock;
    }
}
