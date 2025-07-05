import java.util.*;
public class operators {
  
  static void computation(int a, int b) {
     computemeclass com = new computemeclass();

     System.out.println("The Sum of two number is " +   com.sum(a,b));
    System.out.println("The Diff of two number is " +   com.diff(a,b));
    System.out.println("The Product of two number is " +   com.pro(a,b));

    if(a > b)
       System.out.println("The Product of two number is " +   com.quo(a,b));
    else
       System.out.println("invalid input data");
    
  
  }
  public static void main(String[] args) {

     System.out.print("\033[H\033[2J");
    System.out.flush();

    int num1 = 14;
    int num2 = 7;

    computation(num1,num2);
    
  }
}
 
 
