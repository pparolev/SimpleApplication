package com.picklesolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSubstraction {

    @Test
    public void TestSubstract() {
        MessageBuilder mb = new MessageBuilder();

        assertEquals(4, mb.Sum(2, 2));
    }
}