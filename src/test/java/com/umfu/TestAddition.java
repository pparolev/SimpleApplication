package com.umfu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddition {

    @Test
    public void TestAdd() {
        MessageBuilder mb = new MessageBuilder();

        assertEquals(10, mb.Sum(5, 5));
    }
}