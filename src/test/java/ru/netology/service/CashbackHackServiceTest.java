package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldAmountBelowBoundary() {
        int amount = 600;
        assertEquals(service.remain(amount), 400);
    }

    @org.junit.Test
    public void shouldAmountUpperBoundary() {
        int amount = 1800;
        assertEquals(service.remain(amount), 200);
    }

    @org.junit.Test
    public void shouldAmountEqualBoundary() {
        int amount = 1000;
        assertEquals(service.remain(amount), 0);
    }

    @org.junit.Test
    public void shouldAmountIfZero() {
        int amount = 0;
        assertEquals(service.remain(amount), 1000);
    }

}