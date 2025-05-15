package Codewars_ex.fundamentals;

public class CountTheDivisorsOfANumber {

    public long numberOfDivisors(int n) {
        int count = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        if (sqrt * sqrt == n) {
            count--;
        }

        return count;
    }

}
