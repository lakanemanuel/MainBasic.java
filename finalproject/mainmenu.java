package finalproject;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainmenu {
    
static void menu() {
     

     Get_Update_Data getupdate = new Get_Update_Data();
     getupdate.clearscreen();

      banktransaction bt = new banktransaction();

    System.out.println("1. View Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. View Transaction History");
    System.out.println("5. Exit");
    System.out.println("\n\n ");

    Scanner scanner = new Scanner(System.in);

       
        
      System.out.print("Choose transaction: ");

      Integer option = scanner.nextInt();
    
      if(option ==1)
      {

             bt.viewbalance("currentbalance.txt");
      }
      else if (option ==2) 
      {
             bt.deposit("currentbalance.txt");
      }
       else if (option ==3) 
      {
             bt.Withdraw("currentbalance.txt");
      }
         else if (option ==4) 
      {
             getupdate.viewtransaction("transactions.txt");
      }
          else if (option ==5) 
      {
                 getupdate.clearscreen();
                  System.out.println("Thank you for using our system!");
      }
      else
      {
         System.out.println("Invalid option");
      }
    
       scanner.close();
  }
}
