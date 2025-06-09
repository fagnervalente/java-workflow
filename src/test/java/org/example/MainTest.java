package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sum_with_positives() {
        assertEquals(2, Main.sum(1,1));
    }
}