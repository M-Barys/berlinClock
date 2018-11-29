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
        //When
        String representation = clock.getRepresentation();
        //Then
        Assertions.assertThat(representation).isEqualTo("YOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    public void testHours() {
        //Given
        BerlinClockImmutable clock = new BerlinClockImmutable().setHours(21);
        //When
        String representation = clock.getRepresentation();
        //Then
        Assertions.assertThat(representation).isEqualTo("OYYYYOOOOOOOOOOOOOOOOOOO");
    }

    @Test
    public void testSingleHours() {
        //Given
        BerlinClockImmutable clock = new BerlinClockImmutable().setSingleHours(4);
        //When
        String representation = clock.getRepresentation();
        //Then
        Assertions.assertThat(representation).isEqualTo("OOOOOYYYYOOOOOOOOOOOOOOO");
    }

    @Test
    public void testMinutes() {
        //Given
        BerlinClockImmutable clock = new BerlinClockImmutable().setMinutes(59);
        //When
        String representation = clock.getRepresentation();
        //Then
        Assertions.assertThat(representation).isEqualTo("OOOOOOOOOYYYYYYYYYYYOOOO");
    }

    @Test
    public void testSingleMinutes() {
        //Given
        BerlinClockImmutable clock = new BerlinClockImmutable().setSingleMinutes(59);
        //When
        String representation = clock.getRepresentation();
        //Then
        Assertions.assertThat(representation).isEqualTo("OOOOOOOOOOOOOOOOOOOOYYYY");
    }

}