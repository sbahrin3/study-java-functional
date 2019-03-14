package xyz.ayam.study.functional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HigherOrder {
  public static void main(String[] args) {
    List<String> a = new ArrayList<>();
    a.add("1");
    a.add("&");
    a.add("a");

    List<String> b = new ArrayList<>(a);

    System.out.println(a);
    // collection.sort is a higher order function that accept a function
    Collections.sort(a, (x, y) -> y.compareTo(x));
    System.out.println(a);
    
    // c is a result of higher order function that return a function
    Comparator<String> c = (x, y) -> y.compareTo(x);
    c = c.reversed();

    System.out.println(b);
    Collections.sort(b, c);
    System.out.println(b);
  }
}
