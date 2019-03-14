package xyz.ayam.study.functional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class InterfacesBuiltIn {
  public static void main(String[] args) {
    // 1 param. input & return same type. call apply()
    Function<Integer, String> fn = x -> {
      if (x.intValue() % 2 == 0) {
        return "even";
      }
      return "odd";
    };
    System.out.println(fn.apply(1));
    
    
    
    // 1 param. set input type only. return type same as input type. call apply()
    UnaryOperator<Integer> un = x -> x.intValue() + 1;
    System.out.println(un.apply(1));

    
    
    // 2 params. input type only. return same as input. call apply()
    BinaryOperator<Integer> bi = (x,y) -> x.intValue() + y.intValue();
    System.out.println(bi.apply(1,2));
    
    
    
    // 1 param. set input type only. always return boolean. call test()
    Predicate<Integer> pr = x -> x.intValue() % 2 == 0;
    System.out.println(pr.test(1));
    
    // negative test
    Predicate<Integer> pr2 = pr.negate();
    System.out.println(pr2.test(1));
    
    
    
    // no params. return type only. call get()
    Supplier<Integer> su = () -> 1 + 2;
    System.out.println(su.get());
    
    // 1 param, input type only. no return. call accept()
    Consumer<Integer> co = System.out::println;
    co.accept(1);
  }
}
