package Codewars_ex;
///You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
///
/// a can contain numbers or strings. x can be either.
///
/// Return true if the array contains the value, false if not.
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
