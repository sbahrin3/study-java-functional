package xyz.ayam.study.functional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Composition {
  public static void main(String[] args) {
    Predicate<String> p1 = x -> x.contains("hello");
    Predicate<String> p2 = x -> x.contains("world");
    
    // and
    Predicate<String> p3 = p1.and(p2);
    System.out.println(p3.test("hello world"));
    System.out.println(p3.test("hello ayam"));
    
    // or
    Predicate<String> p4 = p1.or(p2);
    System.out.println(p4.test("hello world"));
    System.out.println(p4.test("hello ayam"));
    System.out.println(p4.test("ayam goreng"));
    
    
    
    Function<Integer, Integer> fn1 = x -> x + 2;
    Function<Integer, Integer> fn2 = x -> x * 2;

    Function<Integer, Integer> fn3 = fn1.compose(fn2); // = (x * 2) + 2;
    System.out.println(fn3.apply(5));
    
    Function<Integer, Integer> fn4 = fn1.andThen(fn2); // = (x + 2) * 2;
    System.out.println(fn4.apply(5));
    
  }
}
