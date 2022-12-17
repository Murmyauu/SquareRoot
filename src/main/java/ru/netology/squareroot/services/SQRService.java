package ru.netology.squareroot.services;

public class SQRService {
    public int calcSqrtRoot(int lowerLimit, int upperLimit) {
        int counter = 0;
        int max = 99;
        int i = 10;
        for (i = i; i <= max; i++) {
            int root = i * i;
            if (root >= lowerLimit && root <= upperLimit) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
