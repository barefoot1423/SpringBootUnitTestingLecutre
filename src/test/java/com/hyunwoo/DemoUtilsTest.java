package com.hyunwoo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();

        assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
        assertNotEquals(8, demoUtils.add(2, 4), "2 +4 must not be 8");
    }

}
