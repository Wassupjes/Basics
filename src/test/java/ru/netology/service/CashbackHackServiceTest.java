package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    @org.junit.Test
    public void cashbackHack100() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(100);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void cashbackHack999() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void cashbackHack1000() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void cashbackHack1001() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }
}