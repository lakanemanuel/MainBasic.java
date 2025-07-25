package finalproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;

public class banktransaction {

static String filePath()
{
    return "/workspaces/MainBasic.java/finalproject/";
}
static void updatefile(String file, String content)
{
    String filePath = filePath().toString()+file;

        try {
            FileWriter writer = new FileWriter(filePath); 
            writer.write(content);
            writer.close(); 
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
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
    //   System.out.println("\n\n\n\n Your current balance is: " + mycurrentbalance);

         Scanner scanner = new Scanner(System.in);

          double balance = Double.parseDouble(mycurrentbalance);
       
        
      System.out.print("\n\n\nAmount to Deposit: ");

      double deposit = scanner.nextDouble();
       
      balance = balance + deposit;
   
        String content = Double.toString(balance);
     
    

         try {
            FileWriter writer = new FileWriter(filePath); 
            writer.write(content);
            writer.close(); 
           // System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }

       /*
              try {

             
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/workspaces/MainBasic.java/finalproject/transactions.txt"));
          bufferedWriter.newLine(); 
           bufferedWriter.write(content);
           bufferedWriter.close();



           
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
        */

  
          try (FileWriter fw = new FileWriter("/workspaces/MainBasic.java/finalproject/transactions.txt", true); // true for append mode
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.newLine(); // Adds a new line character before writing the content
            bw.write(content);

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
      scanner.close();


         System.out.print("\n\nYour current balance is: " + balance);
       

           System.out.print("\n\n\n\n Press Enter to go back to main menu");

      // String anykey = scanner.nextLine();
        viewbalance("currentbalance.txt")
  }
}

