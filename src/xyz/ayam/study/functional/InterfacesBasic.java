package xyz.ayam.study.functional;
import java.io.IOException;

public class InterfacesBasic {
  
  public static void main(String[] args) throws IOException {
    SimpleInterface1 si1 = () -> System.out.println("It's functional");
    si1.print();
    
    SimpleInterface2 si2 = System.out::println;
    si2.print("It's functional");
    
    SimpleInterface3 si3 = () -> 1;
    System.out.println(si3.one());
    
    SimpleInterface4 si4 = (a, b) -> a > b;
    System.out.println(si4.bigger(3, 4));
    System.out.println(si4.bigger(4, 3));
  }
}

// accept and return nothing
interface SimpleInterface1 {
  void print();
}

// accept without return
interface SimpleInterface2 {
  void print(String message);
}

// return without accept
interface SimpleInterface3 {
  int one();
}

// accept and return
interface SimpleInterface4 {
  boolean bigger(int a, int b);
}