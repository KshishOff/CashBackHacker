package ru.netology;

import org.testng.annotations.Test;

import java.util.concurrent.Callable;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testWhenThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testWhenZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testWhenMoreThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testWhenOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testWhen999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testWhenEnough() {
        CashbackHackService service = new CashbackHackService();
        int amount = 555;
        int actual = service.remain(amount);
        int expected = 445  ;
        assertEquals(actual, expected);
    }

}