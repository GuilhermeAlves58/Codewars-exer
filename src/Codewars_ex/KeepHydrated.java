package Codewars_ex;

public class KeepHydrated  {
  public static int liters(double time)  {    
    double water = time * 0.5;
    return (int) Math.floor(water);
  }
  public static void main(String[] args){
      System.out.println(liters(3));     
      System.out.println(liters(6.7));   
      System.out.println(liters(11.8)); 
  }
}