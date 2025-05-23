package Codewars_ex.fundamentals;
/// The cockroach is one of the fastest insects. Write a function which takes its speed in km per hour and returns it in cm per second, rounded down to the integer (= floored).
///
/// For example:
///
/// 1.08 --> 30
/// Note! The input is a Real number (actual type is language dependent) and is >= 0. The result should be an Integer.
public class Cockroach {
    public static int cockroachSpeed(double x) {
        return (int) (x * 100 / 3.6);
    }

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
    }
}
