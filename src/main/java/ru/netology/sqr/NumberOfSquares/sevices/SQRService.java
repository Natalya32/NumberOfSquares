package ru.netology.sqr.NumberOfSquares.sevices;

public class SQRService {
    public int calcSqrNumber(int begin, int end) {
        int number = 0;
        int x;
        for (int i = 10; i <= 99; i++) {
            x = i * i;
            if (x >= begin) {
                if (x <= end) {
                    number = number + 1;
                } else {
                    break;
                }
            }
        }
        return number;
    }

}
