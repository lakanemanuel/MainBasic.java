package finalproject;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainmenu {
    
static void menu() {
     

    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.println("1. View Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("\n\n ");

    Scanner scanner = new Scanner(System.in);

       
        
      System.out.print("Choose transaction: ");

      Integer option = scanner.nextInt();
    
      if(option ==1)
      {
         //System.out.println("option1");
             //viewcurrentbalance vb = new viewcurrentbalance();
             //vb.viewbalance();

             banktransaction bt = new banktransaction();
             bt.viewbalance("currentbalance.txt");
      }
      else if (option ==2) 
      {
          banktransaction bt = new banktransaction();
             bt.deposit("currentbalance.txt");
      }
      else
      {
         System.out.println("Invalid option");
      }
    
       scanner.close();
  }
}
