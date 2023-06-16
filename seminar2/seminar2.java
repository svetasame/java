package seminar2;

public class seminar2 {
  public static void main (String[] args) {
    String s = "ППривер!т";
    // String s1 = "привер!т";
    // s1 = s;

    Thread r = new Thread();
    Thread r1 = new Thread();
    System.out.println(r.equals(r1)); //самое надежное сравнение строк

    s.length(); // длина строки, метод
    s.concat(s); // s+= склеивание строчек
    s.endsWith("т"); // проверка на что кончается строчка
    s.indexOf("ри"); // вернет индекст этих букв
    s.lastIndexOf("р"); // если символ повторяется считает справа
    s.getBytes(); // возвращает в виде массива
    System.out.println(s.toLowerCase()); // делает  все буквы маленькими но исходную не меняем
    System.out.println(s);
    s = s.toLowerCase(); // тогда перезапишется
    s.charAt(s.length()/2); // возвращает букву которая в конкретном индексе
    System.out.println(s.substring(s.length()/2, s.length()-1)); 
    // отрезает часть строки от одного параметра до другого. 1 начало второй конец, если второго нет то до конца
    System.out.println(s.subSequence(3,4));
    // отсечь как в сабстрингс, 
    //возращает не строку а последовательность букв
    // повторить 4 раза
    System.out.println("--".repeat(4));  
    
    System.out.println(s
    .repeat(4)
    .replace("п", "c")); // заменить буквы
    System.out.println(s);
    System.out.println(s
    .replace("п", "")); //удалитть символы

    s.split(""); // разрезает строку по разделителю на массив

    String[] tmp = s.repeat(4).split(" ");
    System.out.println(s);

    StringBuilder builder = new StringBuilder("Привет! ");
    s = builder.toString();
    builder.append(.235f); //добавляем в билдер любые данные
    builder.setCharAt(builder.length()/2, '0'); //втыкаем на определенные индекс
    builder.deleteCharAt(3); // удаляет символ на определенном индексе
    builder.compareTo(new StringBuilder("!")); // сравнение с другим билдером
    builder.insert(builder.length()/2-1, true); // вставить бул в определенное место
    builder.delete(3,4); // удалить диапазон по индексам
    builder.lastIndexOf(s, 0);
    builder.indexOf(s, 0);
    builder.replace(0, builder.length()/2, "hbhbh");
    builder.reverse(); //разворачивает строку
    builder.charAt(0);
    System.out.println(builder);
    //строку перевести в билдер реверс и оратно
    // отличия от стринга то что билдер меняет исходную строку
    // показали насколько билдер быстрее стринга
    StringBuilder builder1 = new StringBuilder(s);
    s = builder1.reverse().toString();
    System.out.println(s);
    builder1 = null;

    // String str = "";
    StringBuilder builder12 = new StringBuilder(); // можно заранее задать огромный массив
    
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      str += Character.getName(i);
    }
    System.out.println("string res = " + (System.currentTimeMillis() - start));

    start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      builder12.append(Character.getName(i));
    }
    System.out.println("stringbuilder res = " + (System.currentTimeMillis() - start));
    

    // int[] f;
    // f.length // переменная 

  }
}
