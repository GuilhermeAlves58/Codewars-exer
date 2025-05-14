package Codewars_ex.fundamentals;
/// Nathan loves cycling.
///
/// Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
///
/// You get given the time in hours and you need to return the number of litres Nathan will drink, rounded down.
///
/// For example:
///
/// time = 3 ----> litres = 1
///
/// time = 6.7---> litres = 3
///
/// time = 11.8--> litres = 5
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