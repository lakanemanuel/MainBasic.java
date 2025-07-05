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
  static void computation(int a, int b) {
     System.out.println("The Sum of two number is " +   sum(a,b));
    System.out.println("The Diff of two number is " +   diff(a,b));
    System.out.println("The Product of two number is " +   pro(a,b));

    if(a > b)
       System.out.println("The Product of two number is " +   quo(a,b));
    else
       System.out.println("invalid input data");
    
  
  }
  public static void main(String[] args) {

     System.out.print("\033[H\033[2J");
    System.out.flush();

    int num1 = 5;
    int num2 = 7;

    computation(num1,num2);
    
  }
}