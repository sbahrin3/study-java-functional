package xyz.ayam.study.functional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// return result
public class StreamTerminal {
  public static void main(String[] args) {
    List<Integer> a = Arrays.asList(1,2,3,4,5);
    
    // return true if all elements match with predicate
    System.out.println("allMatch");
    System.out.println(a.stream().allMatch(x -> x % 2 == 0));
    System.out.println(a.stream().allMatch(x -> x - 1 >= 0));
    
    // return true if at least 1 element matches with predicate
    System.out.println("anyMatch");
    System.out.println(a.stream().anyMatch(x -> x % 2 == 0));
    System.out.println(a.stream().anyMatch(x -> x - 1 < 0));
    
    // return true if no elements match with predicate
    System.out.println("noneMatch");
    System.out.println(a.stream().noneMatch(x -> x - 1 < 0));
    System.out.println(a.stream().noneMatch(x -> x % 2 == 0));
    
    // return stream into collection
    System.out.println("collect");
    System.out.println(a.stream().collect(Collectors.toList()));
    
    // return stream into collection
    System.out.println("count");
    System.out.println(a.stream().count());

    // return stream into collection
    System.out.println("findAny");
    System.out.println(a.stream().findAny().get());

    // return stream into collection
    System.out.println("findFirst");
    System.out.println(a.stream().findFirst().get());

    // return stream into collection
    System.out.println("forEach");
    a.stream().forEach(System.out::println);

    // return stream into collection
    System.out.println("min");
    System.out.println(a.stream().min((x,y) -> x.compareTo(y)).get());

    // return stream into collection
    System.out.println("max");
    System.out.println(a.stream().max((x,y) -> x.compareTo(y)).get());

    // return stream into collection
    System.out.println("reduce");
    System.out.println(a.stream().reduce((x,y) -> y + x));
    
    // return stream into collection
    System.out.println("toArray");
    System.out.println(a.stream().toArray());
    
    // return stream into collection
    System.out.println("concat");
    Stream.concat(a.stream(), a.stream()).forEach(System.out::println);
  }
}
