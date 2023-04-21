package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    long[] temps = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };


    @Test
    public void getSalesAmountTest() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.getSalesAmount(temps);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void averageAmountTest() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageAmount(temps);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();
        int expected = 6;
        int actual = service.maxSales(temps);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(temps);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void belowAverageTest() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.belowAverage(temps);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void aboveAverageTest() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.aboveAverage(temps);
        Assertions.assertEquals(expected, actual);
    }
}

