package finalproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class banktransaction {

static String filePath()
{
    return "/workspaces/MainBasic.java/finalproject/";
}
static void viewbalance(String vwbalance)
 {

     String mycurrentbalance = "";
      String filePath = filePath().toString()+vwbalance;

       try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            mycurrentbalance = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

    System.out.print("\033[H\033[2J");
    System.out.flush();
       System.out.println("\n\n\n\n Your current balance is: " + mycurrentbalance);

         Scanner scanner = new Scanner(System.in);

       
        
      System.out.print("\n\n\n\n Press Enter to go back to main menu");

      String anykey = scanner.nextLine();
       
       mainmenu mymenu = new mainmenu();
       mymenu.menu();
  }

  static void deposit(String vwbalance)
  {
        String mycurrentbalance = "";
      String filePath = filePath().toString()+vwbalance;

       try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            mycurrentbalance = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

    System.out.print("\033[H\033[2J");
    System.out.flush();
       System.out.println("\n\n\n\n Your current balance is: " + mycurrentbalance);

         Scanner scanner = new Scanner(System.in);

          double balance = Double.parseDouble(mycurrentbalance);
       
        
      System.out.print("Amount to Deposit: ");

      double deposit = scanner.nextDouble();
       
      balance = balance + deposit;

         System.out.print("\n\nYour current balance is: " + balance);
       

  }
}

