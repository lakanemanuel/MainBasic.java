package finalproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.time.LocalDate;
public class banktransaction {


static void viewbalance(String vwbalance)
 {

    Get_Update_Data getupdate = new Get_Update_Data();
     getupdate.clearscreen();

      String mycurrentbalance = "";

       mycurrentbalance = getupdate.getbalance(vwbalance);

       System.out.println("\n\n\n\n Your current balance is: " + mycurrentbalance);

         Scanner scanner = new Scanner(System.in);

      System.out.print("\n\n\n\n Press Enter to go back to main menu");

      String anykey = scanner.nextLine();
       
       mainmenu mymenu = new mainmenu();
       mymenu.menu();
  }

  static void deposit(String vwbalance)
  {
     
    String filePath = vwbalance;

     String mycurrentbalance = "";

    Get_Update_Data getupdate = new Get_Update_Data();
     getupdate.clearscreen();

      mycurrentbalance = getupdate.getbalance(vwbalance);
    
    Scanner scanner = new Scanner(System.in);

     double balance = Double.parseDouble(mycurrentbalance);
       
      System.out.print("\n\n\nAmount to Deposit: ");

      double deposit = scanner.nextDouble();
       
      balance = balance + deposit;
   
      String content = Double.toString(balance);

      getupdate.updatefile(filePath, content);
      filePath = "";

      filePath = "transactions.txt";
   
      getupdate.updatebanktransaction(filePath,mycurrentbalance,Double.toString(deposit), content,"DEP");

     viewbalance("currentbalance.txt");
  }

  static void Withdraw(String vwbalance)
  {
     
    String filePath = vwbalance;

     String mycurrentbalance = "";
     
      Get_Update_Data getupdate = new Get_Update_Data();
     getupdate.clearscreen();

     mycurrentbalance = getupdate.getbalance(vwbalance);
    
    Scanner scanner = new Scanner(System.in);

     double balance = Double.parseDouble(mycurrentbalance);
       
      System.out.print("\n\n\nAmount to Withdraw: ");


      double Withdraw = scanner.nextDouble();

      if(balance >=Withdraw)
      {
            balance = balance - Withdraw;
   
         String content = Double.toString(balance);

         getupdate.updatefile(filePath, content);
         filePath = "";

         filePath = "transactions.txt";
   
         getupdate.updatebanktransaction(filePath,mycurrentbalance,Double.toString(Withdraw), content,"WID");

         viewbalance("currentbalance.txt");
      }
      else
      {
          System.out.println("Your requested amount is grader than your current balance");
          Withdraw(vwbalance);
      }
       
    
  }
}

