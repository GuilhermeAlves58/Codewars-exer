package Codewars_ex;
/// Create a function that accepts a parameter representing a name and returns the message: "Hello, <name> how are you doing today?".
///
/// make sure you type the exact thing I wrote or the program may not execute properly

public class ReturningStrings{
    public static void main(String[] args) {
        greet("Ryan");
    }
    public static String greet(String name){
        return System.out.println("Hello,"+ name + "how are you doing today?");
    }
}
