package seminar1;

import java.util.Random;

public class homework1 {
  public static void main(String[] args) {
    int i = randomnumber();
    System.out.println("Случайное число от 0 до 2000 = " + i);
    int n = findbit(i);
    System.out.println(n);
    System.out.println("Кратные n числа");
    returnarray1(i, n);
    System.out.println("Некратные n числа");
    returnarray2(i, n);

  }

  // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
  public static int randomnumber() {
    Random random = new Random();
    int i = random.nextInt(2001);
    return i;
  }

  // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
  public static int findbit(int i) {
    int n = 0;
    while (i > 1) {
      i >>= 1;
      n++;
    }
    return n;
  }

  // 3. Найти все кратные n числа в диапазоне от
  // i до Short.MAX_VALUE сохранить в массив m1
  public static int[] returnarray1(int i, int n) {
    int[] m1 = new int[Short.MAX_VALUE - i];
    int index = 0;
    for (int k = i; k <= Short.MAX_VALUE; k++) {
      if (k % n == 0) {
        m1[index] = k;
        index++;
      }
    }
    for (int j = 0; j < index; j++) {
      System.out.print(m1[j] + ", ");
    }
    return m1;
  }

  // 4. Найти все некратные n числа в диапазоне от
  // Short.MIN_VALUE до i и сохранить в массив m2
  public static int[] returnarray2(int i, int n) {
    int[] m2 = new int[i - Short.MIN_VALUE];
    int index = 0;
    for (int k = Short.MIN_VALUE; k <= i; k++) {
      if (k % n != 0) {
        m2[index] = k;
        index++;
      }
    }
    for (int j = 0; j < index; j++) {
      System.out.print(m2[j] + ", ");
    }
    return m2;
  }

}
