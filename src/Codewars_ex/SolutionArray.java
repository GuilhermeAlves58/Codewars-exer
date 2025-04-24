package Codewars_ex;

public class SolutionArray {
    public static boolean contains(Object[] a, Object x){
        for (Object item : a){
            if(item.equals(x)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(contains(new Object[] {66, 101}, 66));
        System.out.println(contains(new Object[] {66, 101}, 99));
        System.out.println(contains(new Object[] {"apple", "banana"}, "banana"));
        System.out.println(contains(new Object[] {"apple", "banana"}, "grape"));
    }

}
