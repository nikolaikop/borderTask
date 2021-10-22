package ru.netology.sqr;

public class SQRService {
    public int calculate(int bottomBorder, int upperBorder) {
        int j = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottomBorder && i * i <= upperBorder) {
                j = j + 1;
            }
        }
        return j;
    }
}
