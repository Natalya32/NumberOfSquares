package ru.netology.sqr.NumberOfSquares.sevices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void shouldCalculateParamiterLimit(int expected, int begin, int end) {
        SQRService service = new SQRService() {
            int actual = service.calcSqrNumber(begin, end);
            Assertions.assertEquals(expected, actual);
        }
    }
}