package seminar2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


  public class homework2 {
  public static void main(String[] args) {
    StringBuilder text = new StringBuilder();
    try (BufferedReader buffer = new BufferedReader(
        new FileReader("D:/обучение Гик Брейнс/java/seminar2/filehome2.txt"))) {
      String line;
      while ((line = buffer.readLine()) != null) {
        text.append(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    String str1 = text.toString();
    String[] out = stringparsebig(str1);
    System.out.println(str1);
    for (String line : out) {
      System.out.println(line);
    }

    stringparse11();
    // checkfaster ();

  }

  public static void stringparse() {
    String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    String[] tmp = str
        .replace("{", "")
        .replace("}", "")
        .split(",");
    System.out.println(str);
    StringBuilder builder = new StringBuilder();
    for (String element : tmp) {
      String[] pairs = element.split(":");
      String key = pairs[0];
      String value = pairs[1];
      if (!value.equals("\"null\"")) {
        builder
            .append(key.replace("\"", ""))
            .append("=")
            .append(value.replace("\"", ""))
            .append(",");
      }
    }
    builder.setLength(builder.length() - 1);
    System.out.println(builder.toString());
  }

  public static void stringparse11() {
    String str = "{\"name\" :\"Ivanov\", \"country\" :\"Russia\", \"city\" :\"Moscow\", \"age\":\"null\"}";
    String[] strings = str.replaceAll("\\p{P}","").split(" ");
    StringBuilder build = new StringBuilder();
    build.append(strings[1]).append("=").append(strings[3]);
    int i = 0;
    System.out.println(build);
  }

  public static String[] stringparsebig(String str) {
    String[] tmp = str
        .replace("\"", "")
        .split("},\\{");
    String[] out = new String[tmp.length];
    int ch = 0;
    for (String s : tmp) {
      String[] people = s.split(",");
      out[ch++] = people[0].split(":")[1]+
      " получила "+people[1].split(":")[1]+" по предмету "
      +people[2].split(":")[1].replace("}]", "");
      }
    return out;
  }

  public static void checkfaster (){
    String str = "";
    StringBuilder builder12 = new StringBuilder();
    
    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
      str += "A";
    }
    System.out.println(str);
    String newstr = str.toLowerCase();
    System.out.println(newstr);
    System.out.println("string res = " + (System.currentTimeMillis() - start));
    
    start = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
      builder12.append("A");
    }
    System.out.println(builder12);
    builder12.replace(0, builder12.length(), "a");
    for (int i = 0; i < 1000; i++) {
      builder12.append("а");
    }
    System.out.println(builder12);
    System.out.println("stringbuilder res = " + (System.currentTimeMillis() - start));
  }
}
 