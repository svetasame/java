package seminar2;

import java.util.Scanner;

  public class class2 {
    public static void main (String[] args) {
      String stra = scanstring("Введите первую строку: ");
      String strb = scanstring("Введите вторую строку: ");
      // проверка строки на содержание определенного контента
      checkstring (stra,strb);
      checkstringreverse (stra,strb);

    }
    
    public static String scanstring(String message) {
      System.out.println(message);
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      System.out.println(str);
      return str;
    }

    // проверка строки на содержание определенного контента
    public static void checkstring (String str1, String str2) {
      if (str1.contains(str2)) {
        System.out.println("СОДЕРЖИТ");
      }
      else {
        System.out.println("не содержит");
      }
    }

    // проверка строки на содержание определенного контента задом наперед
    public static void checkstringreverse (String str11, String str22) {
      StringBuilder builder = new StringBuilder(str22);
      if (str11.equals(builder.reverse().toString())) {
        System.out.println("является");
      }
      else {
        System.out.println("не является");
      }
    }
 
 
 

}