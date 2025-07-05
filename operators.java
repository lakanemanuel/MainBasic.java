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

  static void nums(int a, int b, int c) {
     computemeclass com = new computemeclass();
   
    System.out.println(  "   " + com.num1(a) + "  " + com.num1(b) + "  " + com.num1(c));
   
  }
  
  public static void main(String[] args) {

     System.out.print("\033[H\033[2J");
    System.out.flush();

    int num1 = 3;
    int num2 = 6;
    int num3 = 4;

   // computation(num1,num2);
    nums(num1,num2,num3);

   


  }
}
 
 
