package com.berlinClock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.BitSet;


public class BerlinClockImmutable {
    private final BitSet state;

    public BerlinClockImmutable() {
        this.state = new BitSet(25);
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

}
