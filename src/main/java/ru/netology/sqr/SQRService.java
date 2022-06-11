package ru.netology.sqr;

public class SQRService {
    public int calcSqrtAmount(int left, int right) {
        int x = 99;
        int am = 0;

        for (int i = 10; i <= x; i++) {
            if (i * i >= left && i * i <= right) {
                am++;
            }
        }
        return am;
    }
}