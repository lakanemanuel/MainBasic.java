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

    Mypassword = getupdate.getpassword("password.txt");

     Scanner scanner = new Scanner(System.in);

      System.out.print("Enter your password:   ");

      String password = scanner.nextLine();
  
      if(password.trim().toString().equals(Mypassword.trim().toString()))
       {
        
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