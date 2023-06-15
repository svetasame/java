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

    // String strfortime =
    // "АААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААА
    // АААААААААААААААААААААААААААААААААААААААААААААААА
    // АААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // АААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // АААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА
    // АААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА";

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

  public static String[] stringparsebig(String str) {
    StringBuilder builder = new StringBuilder();
    String[] tmp = str
        .replaceAll("\\[|\\]|\\{|\\}", "")
        .split(",");
    String[] out = new String[tmp.length];
    for (int i = 0; i < tmp.length; i++) {
      String element = tmp[i];
      String[] people = element.split(":");
      String key = people[0].replaceAll("\"", "").trim();
      String value = people[1].replaceAll("\"", "").trim();
      switch (key) {
        case "фамилия":
          builder.append("Студент ").append(value).append(" получил ");
          break;
        case "оценка":
          builder.append(value).append(" по предмету ");
          break;
        case "предмет":
          builder.append(value).append(". ");
          out[i] = builder.toString();
          builder.setLength(0);
          break;
      }
    }
    return out;
  }

}
 