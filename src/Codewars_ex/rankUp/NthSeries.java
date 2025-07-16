package Codewars_ex.rankUp;

public class NthSeries {
    public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (1 + i * 3);
        }

        return String.format("%.2f", sum);
    }
}
