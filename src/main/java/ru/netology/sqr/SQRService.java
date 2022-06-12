package ru.netology.sqr;

public class SQRService {
    public int calcSqrtAmount(int left, int right) {
        int maxNum = 99;
        int counter = 0;

        for (int i = 10; i <= maxNum; i++) {
            if (i * i >= left && i * i <= right) {
                counter++;
            }
        }
        return counter;
    }
}