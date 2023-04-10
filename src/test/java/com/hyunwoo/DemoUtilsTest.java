package com.hyunwoo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();

        int expected = 6;

        int actual = demoUtils.add(2, 4);

        Assertions.assertEquals(expected, actual, "2 + 4 must be 6");
    }

}
