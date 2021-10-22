package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"200,300", "300,400", "400,500"})
    void calculateRegular(int bottomBorder, int upperBorder) {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculate(bottomBorder, upperBorder);
        assertEquals(expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }
}