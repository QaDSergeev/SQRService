package ru.netology.sqr;

public class SQRService {

    public int findSquares(int min, int max) {

        int firstDigit = 10;
        int finishDigit = 99;
        int countSquares = 0;

        if (min < firstDigit * firstDigit ||
                max > finishDigit * finishDigit) {

            return countSquares;
        }

        for (int i = firstDigit; i < finishDigit; i++) {

            int square = i * i;

            if (square >= min &&
                    square < max) {

                countSquares++;
            }
        }

        return countSquares;
    }
}
