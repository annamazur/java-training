package com.github.annamazur.t2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pmazur on 2015-06-28.
 */
public class TrojkatTest {
    Trojkat trojkat;

    @Test
    public void shouldReturnTrue()
    {
        trojkat = new Trojkat();
        trojkat.setA(2.0);
        trojkat.setH(6.0);
        Double result = trojkat.obliczPole();
        Double expected = 6.0;

        Assert.assertTrue(expected.doubleValue() == result.doubleValue());
    }
}
