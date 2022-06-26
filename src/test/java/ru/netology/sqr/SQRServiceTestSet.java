package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTestSet {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/testParameters.csv")
    public void checkCountSquares(int startRange, int endRange, int expectedSqrs){

        SQRService sqrService = new SQRService();

        int actualSqrs = sqrService.findSquares(startRange, endRange);

        assertEquals(expectedSqrs, actualSqrs, "Количество квадратов посчитано не правильно");
    }
}
