package ru.netology.sqr;

public class SQRService {
    public int calculate(int bottomBorder, int upperBorder) {
        int sqrNum = 0;
        for (int i = 10; i <= 99; i++) {
            int doubleI = i * i;
            if (doubleI >= bottomBorder && doubleI <= upperBorder) {
                sqrNum = sqrNum + 1;
            }
        }
        return sqrNum;
    }

/*    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calculate(200,300));
        System.out.println(service.calculate(0,100));
        System.out.println(service.calculate(300,320));
    }*/
}
