package Codewars_ex.fundamentals;
/// Create a function which answers the question "Are you playing banjo?".
/// If your name starts with the letter "R" or lower case "r", you are playing banjo!
///
/// The function takes a name as its only argument, and returns one of the following strings:
///
/// name + " plays banjo"
/// name + " does not play banjo"
/// Names given are always valid strings.
import java.util.Scanner;

public class Banjo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = scanner.next();

        System.out.println(areYouPlayingBanjo(name));
    }

    public static String areYouPlayingBanjo(String name) {
        if (name.charAt(0) == 'R' || name.charAt(0) == 'r') {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}
