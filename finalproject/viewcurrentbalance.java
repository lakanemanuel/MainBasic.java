package finalproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class viewcurrentbalance {
    

static void viewbalance() {
     

    System.out.print("\033[H\033[2J");
    System.out.flush();

     String mycurrentbalance = "";
      String filePath = "/workspaces/MainBasic.java/finalproject/currentbalance.txt";

       try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            mycurrentbalance = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

       System.out.println("Your current balance is: " + mycurrentbalance);

         Scanner scanner = new Scanner(System.in);

       
        
      System.out.print("\n\n\n\nPress Enter to go back to main menu");

      String anykey = scanner.nextLine();
       
       mainmenu mymenu = new mainmenu();
       mymenu.menu();
  }
}

