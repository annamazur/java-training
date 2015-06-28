package com.github.annamazur.t2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pmazur on 2015-06-28.
 */
public class UtilsTest {

    @Test
    public void shouldReturnTrue()
    {
        Trojkat trojkat = new Trojkat();
        trojkat.setA(2.0);
        trojkat.setH(6.0);

        Double result = Utils.obliczPole(trojkat);
        Double expected = 6.0;

        Assert.assertTrue(expected.doubleValue() == result.doubleValue());
    }
}
