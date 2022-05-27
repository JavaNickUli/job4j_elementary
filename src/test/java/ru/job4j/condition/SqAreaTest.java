package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3K2Then0dot5() {
        double p = 3;
        double k = 2;
        double expected = 0.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K1dot5Then2dot94() {
        double p = 7;
        double k = 1.5;
        double expected = 2.94;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5dot8K7Then0dot92() {
        double p = 5.8;
        double k = 7;
        double expected = 0.92;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}