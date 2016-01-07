package com.example.jirapong.androidcilab;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by jirapong on 1/7/16.
 */
public class MainActivityTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testIsNotEmpty_InsertNormalString_ShouldTrue() {

        assertTrue(MainActivity.labTest());
    }

}