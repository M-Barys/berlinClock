package com.berlinClock;

import com.sun.jndi.ldap.Ber;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.BitSet;

public class BerlinClockImmutable {
    private final BitSet state;

    public BerlinClockImmutable() {
        this.state = new BitSet(24);
    }

    public BitSet getState() {
        BitSet cloned = new BitSet(24);
        cloned.xor(state);
        return cloned;
    }

    private BerlinClockImmutable(BitSet state) {
        this.state = state;
    }

    public String getRepresentation() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 24 ; i++) {
            boolean b = state.get(i);
            if (b) {
                builder.append("Y");
            } else {
                builder.append("O");
            }
        }

//        state.stream() TODO implement the same
        return builder.toString();
    }

    public BerlinClockImmutable setSecond(int nrOfSeconds) {
        BitSet changedState = new BitSet(24);
        changedState.xor(state);
        changedState.set(0, nrOfSeconds % 2);
        return new BerlinClockImmutable(changedState);
    }

    public BerlinClockImmutable setHours(int nrOfHours) {
        BitSet changedState = new BitSet(24);
        changedState.xor(state);
        changedState.set(1, nrOfHours/5+1);
        return new BerlinClockImmutable(changedState);
    }

    public BerlinClockImmutable setSingleHours(int nrOfHours) {
        BitSet changedState = new BitSet(24);
        changedState.xor(state);
        changedState.set(5, nrOfHours % 5 + 5);
        return new BerlinClockImmutable(changedState);
    }

    public BerlinClockImmutable setMinutes(int nrOfMinutes) {
        BitSet changedState = new BitSet(24);
        changedState.xor(state);
        changedState.set(9, nrOfMinutes / 5 + 9);
        return new BerlinClockImmutable(changedState);
    }

    public BerlinClockImmutable setSingleMinutes(int nrOfMinutes) {
        BitSet changedState = new BitSet(24);
        changedState.xor(state);
        changedState.set(20, nrOfMinutes % 5 + 20);
        return new BerlinClockImmutable(changedState);
    }

    public BerlinClockImmutable integrateBerlinClock(String actualTime){

        int nrOfHours = Integer.valueOf(actualTime.substring(0, 2));
        int nrOfMinutes = Integer.valueOf(actualTime.substring(3, 5));
        int nrOfSeconds = Integer.valueOf(actualTime.substring(6));

        BitSet changedState = new BitSet(24);
        BerlinClockImmutable state[] = new BerlinClockImmutable[5];

        state[0] = setSecond(nrOfSeconds);
        state[1] = setMinutes(nrOfMinutes);
        state[2] = setSingleMinutes(nrOfMinutes);
        state[3] = setHours(nrOfHours);
        state[4] = setSingleHours(nrOfHours);



        for (int i = 0; i < state.length ; i++) {
            changedState.xor(state[i].getState());
        }
        return new BerlinClockImmutable(changedState);
    }

}
