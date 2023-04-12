package com.hyunwoo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach");
    }

    @Test
    void testEqualsAndNotEquals() {
        System.out.println("Running test : testEqualsAndNotEquals");
        assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
        assertNotEquals(8, demoUtils.add(2, 4), "2 +4 must not be 8");
    }

    @Test
    void testNullAndNotNull() {
        String str1 = null;
        String str2 = "luv2code";

        System.out.println("Running test : testNullAndNotNull");
        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

}
