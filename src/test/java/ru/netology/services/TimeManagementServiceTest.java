
package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class TimeManagementServiceTest {
    @ParameterizedTest

    @CsvFileSource(files="src/test/resources/TimeDate.csv")
    public void testCalculationVocationMonths(long income, long expenses, int expected) {

        TimeManagementService service = new TimeManagementService();

        long actual = service.calculate(income, expenses);


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testCalculationVocationMonths1() {
        TimeManagementService service = new TimeManagementService();

        // подготавливаем данные:
        long income = 10_000;
        long expenses = 3_000;

        int expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(income, expenses);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}
