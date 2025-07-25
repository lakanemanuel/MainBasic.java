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
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
}

static void updatebanktransaction(String file, String currentbalance, String amount,String content,String trans)
{
    String filePath = filePath().toString()+file;
         String line= "";
          LocalDate today = LocalDate.now();
         line = today + "\t\t" + currentbalance + "\t\t"+ trans + "\t\t"+ amount + "\t\t" +content;
             try (FileWriter fw = new FileWriter(filePath, true); // true for append mode
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.newLine(); // Adds a new line character before writing the content
            bw.write(line);

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
}
static String getbalance(String file)
 {

     String mycurrentbalance = "";
      String filePath = filePath().toString()+file;

       try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            mycurrentbalance = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return mycurrentbalance;

  }

  static void viewtransaction(String file)
 {

     String mycurrentbalance = "";
      String filePath = filePath().toString()+file;
   
      System.out.print("\033[H\033[2J");
    System.out.flush();
    
       try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
          //  mycurrentbalance = reader.readLine();
           String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Process each line
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }


            Scanner scanner = new Scanner(System.in);

      System.out.print("\n\n\n\n Press Enter to go back to main menu");

      String anykey = scanner.nextLine();
       
       mainmenu mymenu = new mainmenu();
       mymenu.menu();
      

  }
static void viewbalance(String vwbalance)
 {

         String mycurrentbalance = "";

         mycurrentbalance = getbalance(vwbalance);

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
     
    String filePath = vwbalance;

     String mycurrentbalance = "";

     mycurrentbalance = getbalance(vwbalance);

    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    Scanner scanner = new Scanner(System.in);

     double balance = Double.parseDouble(mycurrentbalance);
       
      System.out.print("\n\n\nAmount to Deposit: ");

      double deposit = scanner.nextDouble();
       
      balance = balance + deposit;
   
      String content = Double.toString(balance);

      updatefile(filePath, content);
      filePath = "";

      filePath = "transactions.txt";
   
      updatebanktransaction(filePath,mycurrentbalance,Double.toString(deposit), content,"DEP");

     viewbalance("currentbalance.txt");
  }

  static void Withdraw(String vwbalance)
  {
     
    String filePath = vwbalance;

     String mycurrentbalance = "";

     mycurrentbalance = getbalance(vwbalance);

    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    Scanner scanner = new Scanner(System.in);

     double balance = Double.parseDouble(mycurrentbalance);
       
      System.out.print("\n\n\nAmount to Withdraw: ");

      double Withdraw = scanner.nextDouble();
       
      balance = balance - Withdraw;
   
      String content = Double.toString(balance);

      updatefile(filePath, content);
      filePath = "";

      filePath = "transactions.txt";
   
      updatebanktransaction(filePath,mycurrentbalance,Double.toString(Withdraw), content,"WID");

     viewbalance("currentbalance.txt");
  }
}

