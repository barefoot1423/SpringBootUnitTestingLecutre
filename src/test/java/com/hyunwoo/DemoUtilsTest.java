package com.hyunwoo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();

        int expected = 6;
        int unexpected = 8;

        int actual = demoUtils.add(2, 4);

        assertEquals(expected, actual, "2 + 4 must be 6");
        assertNotEquals(unexpected, actual, "2 + 4 must not be 8");
    }
}
