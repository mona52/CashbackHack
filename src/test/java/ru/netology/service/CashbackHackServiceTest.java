package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldAmountBelowBoundary() {
        int amount = 600;
        assertEquals(service.remain(amount), 400);
    }

    @org.testng.annotations.Test
    public void shouldAmountUpperBoundary() {
        int amount = 1800;
        assertEquals(service.remain(amount), 200);
    }

    @org.testng.annotations.Test
    public void shouldAmountEqualBoundary() {
        int amount = 1000;
        assertEquals(service.remain(amount), 0);
    }

    @org.testng.annotations.Test
    public void shouldAmountIfZero() {
        int amount = 0;
        assertEquals(service.remain(amount), 1000);
    }

}