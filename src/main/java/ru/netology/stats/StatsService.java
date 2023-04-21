package ru.netology.stats;

public class StatsService {
    public int getSalesAmount(long[] temps) {
        int sales = 0;
        for (long x : temps) {
            sales = (int) (x + sales);
        }
        return sales;
    }
    public int averageAmount(long[] temps) {
        int months = temps.length;
        int average = getSalesAmount(temps) / months;
        return average;
    }
    public int maxSales(long[] temps) {
        int maxMonth = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > temps[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
    public int minSales(long[] temps) {
        int minSales = 0;
        for (int y = 0; y < temps.length; y++) {
            if (temps[y] < temps[minSales]) {
                minSales = y;
            }
        }

        return minSales + 1;
    }
    public int belowAverage(long[] temps) {
        int below = 0;
        for (long z : temps) {
            if (z < averageAmount(temps)) {
                below = below + 1;
            }
        }
        return below;
    }
    public int aboveAverage(long[] temps) {
        int above = 0;
        for (long a : temps) {
            if (a < averageAmount(temps)) {
                above = above + 1;
            }
        }
        return above;
    }
}

