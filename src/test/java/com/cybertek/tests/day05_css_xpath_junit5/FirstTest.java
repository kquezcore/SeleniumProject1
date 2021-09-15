package com.cybertek.tests.day05_css_xpath_junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
//test method is annotated with a @test annotation
    // it's  a void method with no parameters
    @Test
    public void testAddition(){

        int num1= 10;
        int num2= 7;
        int expectedResult=17;
        Assertions.assertEquals(expectedResult , num1+num2);

    }

    @Test
    public void testString(){

        String msg = "I love selenium";

        //assert this msg equal ""I love selenium";
        //assertEquals method accept 2 parameters
        Assertions.assertEquals("I love selenium",msg);

        //assert this starts with "I love"
        //assertTrue method accepts  1 parameter as boolean
        Assertions.assertTrue(msg.startsWith("I love"));


    }


}


