package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calculate3SQRs() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculate(200, 300);
        assertEquals(expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @org.junit.jupiter.api.Test
    void calculate1SQR() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculate(0, 100);
        assertEquals(expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @org.junit.jupiter.api.Test
    void calculate0SQR() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(300, 320);
        assertEquals(expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }
}