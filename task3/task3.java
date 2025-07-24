import java.util.*;

public class task3 {
    public static void main(String[] args) {
     

          System.out.print("\033[H\033[2J");
    System.out.flush();

     String a = new String("Wow");
     String b = a;
     String c = a;
     String d = b;

     boolean b1 = a==b;
     boolean b2 = d.equals(a);
     boolean b3 = !c.equals(b1);

       
     if(b1&&b2&&b3)
     {

             System.out.println("Success");
     }


        
       
    }
}