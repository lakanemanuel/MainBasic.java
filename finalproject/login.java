package finalproject;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class login {
  public static void main(String[] args) {
     
    
     

     Get_Update_Data getupdate = new Get_Update_Data();
     getupdate.clearscreen();
     
    String Mypassword="";
    String myfilepath = "";

    banktransaction bt = new banktransaction();
    myfilepath = bt.filePath().toString().trim();

     // String filePath = "/workspaces/MainBasic.java/finalproject/password.txt";
          myfilepath = myfilepath+"password.txt";;
       try (BufferedReader reader = new BufferedReader(new FileReader(myfilepath))) {
            Mypassword = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

      

     Scanner scanner = new Scanner(System.in);

       
        
      System.out.print("Enter your password:   ");

      String password = scanner.nextLine();
    //12345  scanner.close();
      if(password.trim().toString().equals(Mypassword.trim().toString()))
       {
        //System.out.print(" Password Accepted ");

         mainmenu mymenu = new mainmenu();
         mymenu.menu();
       }
       else
       {
        System.out.print("Invalid Password");
       }
       scanner.close();
    }
}