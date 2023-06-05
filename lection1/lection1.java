
package lection1;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
/**
 * lection1
 * 
 * 
 */
public class lection1 {
  public static void main(String[] args) {
    lib.sayHi();
    // int a = 123;
    // switch (a) {
    //   case 1: 
    //     System.out.println("a");
    //     break;
    //   case 13: System.out.println("b");
    //     break;
    //     default:
    //     break;

    // int a = 320;
    // int count = 0;

    // do {
    //   a /= 10;
    //   count++;
    // } while (a != 0);
    // System.out.println(count);
    // for (int i = 0; i < 10; i++) {
    //   if (i % 2 != 0)
    //     continue;
    //   }
    //   System.out.println(i);
    int[] arr = new int[] {1,2,3,4,5,5,77};
    for (int item : arr) {
      System.out.println(item);
      
    }
  }  



  
    static String getType(Object o) {
    return o.getClass().getSimpleName();
  }
}
// типы данных и переменные

