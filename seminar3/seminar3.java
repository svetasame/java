package seminar3;

import java.util.Random;

import javax.naming.InterruptedNamingException;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Comparator;


public class seminar3 {
  /**
   * @param args
   */
  public static void main (String[] args) {
    
    // List - набор методов в открытом виде - просто как должны называться методы
     //<Integer> можем храрнить только интеджер
    // Object object;

    // list.add(1); // проверяет хватает ли места и можно добавить
    // list.add(.324);
    // list.add("Привет!");
    // list.add(true);
    // if (list.get(2) instanceof String) {
    //   String s = (String) list.get(2);
    // }
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    
    // for (int i = 0; i < 10; i++) {
    //   list.add(new Random().nextInt(15));
    //   list1.add(new Random().nextInt(15));
    // }

    list.add(list.size()/2,1); // по умолчанию в конец но можно добавить по индексу и подвинуть весь массив
    list.addAll(list1); // добавляется весь список как клон
    list.addAll(0, list1); // может вставиться послеиндекса определенного, можно хоть в середины и все сдвинется
    list.size(); // размер 
    if (list.isEmpty()); // проверка на то что есть ли там наполнение

    list.clear(); // всем элементам вместо ссылок ставит null
    list.set(0, 2352); // какой элемент меняем и на что меняем, другие не двигает
    
    ArrayList<String> list3 = new ArrayList<>();
    list3.add("Hello!");
    list3.add("Hello!");
    list3.add("Hello!");
    list3.remove(0); // удаляет по индексу
    list3.remove("Hello!"); // удаляет по объекту
    if (list3.contains("Hello!")); // покаджет есть ли объект в списке
    list.trimToSize(); // обрезать до того сколько элементов записано в массиве а не по его размеру
    list.ensureCapacity(100); // расширить список - пользуются редко

    String as = list3.get(0); // получить элемент с индексом 0 из листа
    
    //пройтись по всем элементам списка
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    for ( int i : list) {
      System.out.println(i); // не можем управлять списком и ничего делать

    }

    // Iterator<Integer> iterator = list.iterator();
    // while (iterator.hasNext()) {
    //   int i = iterator.next();
    //   System.out.println(i);
    //   iterator.remove();
    // }
    // System.out.println(list3.size());

    // ListIterator<Integer> iterator1 = list.listIterator(list.size()-1);
    // while (iterator1.hasPrevious()) {
    //   int i = iterator1.previous();
    //   iterator1.nextIndex();
    //   System.out.println(i);
    //   iterator.remove();
    // }
    // System.out.println(list3.size());
    list.forEach(n -> System.out.println(n)); 
    
    list.retainAll(list1); // проверяет есть ли не совпадающие элементы в двух списках и лишние удаляет
    list.removeAll(list1); // удаляет совпадающие элементы
    ArrayList<Integer> list4 = (ArrayList<Integer>) list.subList(0, list.size()/2);
    // преобразование в скобочках
    // ряет есть ли не совпадающие элементы в двух списк строка
    // е совп - подстрока

    list.sort(Comparator.naturalOrder()); // сортировка. компаратор модно построить свой
    list.sort(new Comparator<Integer>() {
      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }
    });

    list.sort(new Comparator<Integer>() {
      public int compare(Integer o1, Integer o2) {
        if (o1%3 != 0) return 0;
        if (o2%2 != 0) return -1;
        return 1;
      }
    });
    // компэйр сравнивает только числа, строки по буквенно

    System.out.println(list);
    list1.clear();
    list.forEach(n -> list1.add(0, n));

    LinkedList<Integer> linkedlist = new LinkedList<>();
    linkedlist.add(null);
    
  }
}
