package com.theironyard;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testEquilateral() {
        String triangle = Main.sideChecker(1, 1, 1);
        Assert.assertTrue(triangle.equals("equilateral"));
    }

    @Test
    public void testIsoceles() {
        String triangle = Main.sideChecker(1, 1, 2);
        Assert.assertTrue(triangle.equals("isoceles"));
    }

    @Test
    public void testScalene() {
        String triangle = Main.sideChecker(1, 2, 3);
        Assert.assertTrue(triangle.equals("scalene"));
    }
}