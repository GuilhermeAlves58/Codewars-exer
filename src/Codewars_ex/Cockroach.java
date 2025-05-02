package Codewars_ex;

public class Cockroach {
    public static int cockroachSpeed(double x) {
        return (int) (x * 100 / 3.6);
    }

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
    }
}
