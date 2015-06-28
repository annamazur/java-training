package com.github.annamazur.t2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pmazur on 2015-06-28.
 */
public class KwadratTest {
    Kwadrat kwadrat;

    @Test
    public void shouldReturnTrue()
    {
        kwadrat = new Kwadrat();
        kwadrat.setA(2.0);
        Double result = kwadrat.obliczPole();
        Double expected = 4.0;

        Assert.assertTrue(expected.doubleValue() == result.doubleValue());
    }
}
