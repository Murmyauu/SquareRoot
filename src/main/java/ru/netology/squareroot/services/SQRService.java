package ru.netology.squareroot.services;

public class SQRService {
    public int calcSqrtRoot(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 1; i <= upperLimit; i++) {
            if (i * i >= lowerLimit)
                if (i * i <= upperLimit) {
                    counter = counter + 1;
                }
        }
        return counter;
    }
}
