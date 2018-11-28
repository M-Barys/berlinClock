package com.berlinClock;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BerlinClockImmutableTest {

    @Test
    public void testInit() {
        //Given
        BerlinClockImmutable clock = new BerlinClockImmutable();
        //When
        String representation = clock.getRepresentation();
        //Then
        Assertions.assertThat(representation).isEqualTo("OOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    public void testSeconds() {
        //Given
        BerlinClockImmutable clock = new BerlinClockImmutable().setSecond(5);
        clock.getState().set(7);
        //When
        String representation = clock.getRepresentation();
        //Then
        Assertions.assertThat(representation).isEqualTo("YOOOOOOOOOOOOOOOOOOOOOOO");
    }

}