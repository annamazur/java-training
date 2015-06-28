package com.github.annamazur.t2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pmazur on 2015-06-28.
 */
public class ProstokatTest {
    Prostokat prostokat;

    @Test
    public void shouldReturnTrue()
    {
        prostokat = new Prostokat();
        prostokat.setA(2.0);
        prostokat.setB(6.0);
        Double result = prostokat.obliczPole();
        Double expected = 12.0;

        Assert.assertTrue(expected.doubleValue() == result.doubleValue());
    }
}
