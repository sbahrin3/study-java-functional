package xyz.ayam.study.functional;
import java.util.Arrays;
import java.util.List;

// no return
public class StreamNonTerminal {
  public static void main(String[] args) {
    List<String> a = Arrays.asList("hello world", "hello word", "hello world", "hello ayam");
    
    // filter elements based on predicate
    System.out.println("filter");
    a.stream().filter((x) -> !x.contains("a")).forEach(System.out::println);
    
    // perform unary operator for each elements
    System.out.println("map");
    a.stream().map((x) -> x.toUpperCase()).forEach(System.out::println);
    
    // flatten delimited elements
    System.out.println("flatMap");
    a.stream().flatMap((x) -> Arrays.asList(x.split(" ")).stream()).forEach(System.out::println);
    
    // unique / distinct elements only
    System.out.println("distinct");
    a.stream().distinct().forEach(System.out::println);
    
    // limit elements
    System.out.println("limit");
    a.stream().limit(2).forEach(System.out::println);

    // execute consumer when calling terminal operator
    System.out.println("peek");
    a.stream().peek(System.out::println).count();

    // skip few first elements
    System.out.println("skip");
    a.stream().skip(2).forEach(System.out::println);

    // convert to parallel stream
    System.out.println("parallel");
    a.stream().parallel().forEach(System.out::println);

    // convert to sequential stream
    System.out.println("sequential");
    a.stream().sequential().forEach(System.out::println);

    // sort the elements
    System.out.println("sorted");
    a.stream().sorted().forEach(System.out::println);

    // iterate randomly
    System.out.println("unordered");
    a.stream().unordered().forEach(System.out::println);
    
  }
}
