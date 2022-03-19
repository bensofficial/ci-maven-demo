package org.benjaminschmitz.cimavendemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationTest {

    @Test
    void testSum1() {
        assertEquals(2, org.benjaminschmitz.cimavendemo.Application.sum(1,1));
    }

    @Test
    void testSum2() {
        assertEquals(5, org.benjaminschmitz.cimavendemo.Application.sum(2,3));
    }

    @Test
    void testSum3() {
        assertEquals(8, org.benjaminschmitz.cimavendemo.Application.sum(10,-2));
    }
}
