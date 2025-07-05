import java.util.*;
public class operators {
  static int sum(int a, int b) {
    return a + b;
  }
   static int diff(int a, int b) {
    return a - b;
  }
   static int pro(int a, int b) {
    return a - b;
  }

     static int quo(int a, int b) {
    return a / b;
  }
  public static void main(String[] args) {

     System.out.print("\033[H\033[2J");
    System.out.flush();

    int num1 = 5;
    int num2 = 7;
    System.out.println("The Sum of two number is " +   sum(num1,num2));
    System.out.println("The Diff of two number is " +   diff(num1,num2));
    System.out.println("The Product of two number is " +   pro(num1,num2));
    System.out.println("The Product of two number is " +   quo(num1,num2));
  
  }
}