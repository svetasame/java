package seminar1;

import java.util.Random;

public class seminar1 {
  // public static void main (String[] args) {
  //   for (int i = 2; i <=100; i++) {
  //     if ((i%2 !=0 || i /2<2) && 
  //     (i%3 !=0 || i/3<2) && 
  //     (i%5 !=0 || i/5<2) && 
  //     (i%7 !=0 || i/7<2) ) {
  //       System.out.print(i + ",");
  //     }
  //    }
  // }
  
  public static int randomnumber()  {
    Random random = new Random();
    int i = random.nextInt(2001);
    System.out.print("Случайное число от 0 до 2000 = " + i);
    return i;
  }
}
