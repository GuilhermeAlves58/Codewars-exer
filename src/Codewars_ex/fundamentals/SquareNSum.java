package Codewars_ex.fundamentals;

public class SquareNSum {
    public static int squareSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num * num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] example = {1, 2, 2};
        System.out.println(squareSum(example)); //
    }
}
