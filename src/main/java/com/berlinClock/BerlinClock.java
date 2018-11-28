package com.berlinClock;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor

public class BerlinClock {
    private int oneMinutesMod;
    private String oneMinuteRow = "OOOO";
    private String currentOneMinuteRow = "OOOO";
    private int fiveMinutesDiv;
    private int fiveMinutesDiv15;
    private String fiveMinuteRow = "OOOOOOOOOOO";
    private String currentFiveMinuteRow = "OOOOOOOOOOO";
    private int singleHourMod;
    private String singleHourRow = "OOOO";
    private String currentSingleHourRow = "OOOO";
    private int fiveHourDiv;
    private String fiveHourRow = "OOOO";
    private String currentFiveHourRow = "OOOO";
    private int secondsMod;
    private String secondLamp = "O";

    public String singleMinuteRow(int minutes) {
        oneMinutesMod = minutes % 5;
        if (oneMinutesMod < 5) {
            for (int i = 0; i < oneMinutesMod; i++) {
                currentOneMinuteRow = currentOneMinuteRow.substring(0, i) + "Y" + oneMinuteRow.substring(i + 1);
            }
        }
        return currentOneMinuteRow;
    }

    public String fiveMinuteRow(int minutes) {
        fiveMinutesDiv = minutes / 5;
        if (fiveMinutesDiv < 12) {
            for (int i = 0; i < fiveMinutesDiv; i++) {
                currentFiveMinuteRow = currentFiveMinuteRow.substring(0, i) + "Y" + fiveMinuteRow.substring(i + 1);
            }
        }

        String currentFiveMinuteRow15 = currentFiveMinuteRow;
        fiveMinutesDiv15 = minutes / 15;
        for (int i = 1; i < fiveMinutesDiv15 + 1; i++) {
            currentFiveMinuteRow15 = currentFiveMinuteRow15.substring(0, i * 3 - 1) + "R" + currentFiveMinuteRow.substring(i * 3 - 1 + 1);
        }

        return currentFiveMinuteRow15;
    }

    public String singleHoursRow(int hours) {
        singleHourMod = hours % 5;
        if (singleHourMod < 5) {
            for (int i = 0; i < singleHourMod; i++) {
                currentSingleHourRow = currentSingleHourRow.substring(0, i) + "R" + singleHourRow.substring(i + 1);
            }
        }
        return currentSingleHourRow;
    }

    public String fiveHourRow(int hours) {
        fiveHourDiv = hours / 5;
        for (int i = 0; i < fiveHourDiv; i++) {
            currentFiveHourRow = currentFiveHourRow.substring(0, i) + "R" + fiveHourRow.substring(i + 1);

        }
        return currentFiveHourRow;
    }

    public String secLamp(int seconds) {
        secondsMod = seconds % 2;
        if (secondsMod == 0) {
            secondLamp = "Y";
        }
        return secondLamp;
    }
}
