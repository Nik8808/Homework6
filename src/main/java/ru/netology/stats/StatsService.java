package ru.netology.stats;

public class StatsService {
    public int getSalesAmount(long[] temps) {
        int sum = 0;
        for (long salesPerMonth : temps) {
            sum = (int) (salesPerMonth + sum);
        }
        return sum;
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
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < temps[minSales]) {
                minSales = i;
            }
        }

        return minSales + 1;
    }
    public int belowAverage(long[] temps) {
        int below = 0;
        int average = averageAmount(temps);
        for (long salesPerMonth : temps) {
            if (salesPerMonth <  average) {
                below = below + 1;
            }
        }
        return below;
    }
    public int aboveAverage(long[] temps) {
        int above = 0;
        int average = averageAmount(temps);
        for (long salesPerMonth : temps) {
            if (salesPerMonth < average) {
                above = above + 1;
            }
        }
        return above;
    }
}


