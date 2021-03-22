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

    @org.junit.jupiter.api.Test
    public void shouldAmountBelowBoundaryForJ5() {
        int amount = 600;
        assertEquals(400,service.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void shouldAmountUpperBoundaryForJ5() {
        int amount = 1800;
        assertEquals(200,service.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void shouldAmountEqualBoundaryForJ5() {
        int amount = 1000;
        assertEquals(0,service.remain(amount));
    }

    @org.junit.jupiter.api.Test
    public void shouldAmountIfZeroForJ5() {
        int amount = 0;
        assertEquals(1000, service.remain(amount));
    }

}