package com.github.annamazur.t1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Anna on 2015-06-25.
 */
public class HelloWorldTest {

    HelloWorld helloWorld;

    @Test
    public void shouldReturnWord()
    {
        helloWorld = new HelloWorld();
        String result = helloWorld.getWord();
        String expected = "Pania Mazur";

        Assert.assertTrue(expected == result);
    }
}
