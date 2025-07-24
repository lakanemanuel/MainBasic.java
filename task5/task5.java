package task5;

public class task5 {
  public static void main(String[] args) {
     

    System.out.print("\033[H\033[2J");
    System.out.flush();

       int num1 = 1;
       int num2 = 3;
       int num3 =10;

       int largest;

        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
        } else if (num3 > num1 && num3 > num2) {
            largest = num3;
        } else {
            largest = 0;
        }

        if (largest==0)
        {
             System.out.println("All numbers are equal");
        }
        else
        {
                System.out.println("The largest number is: " + largest);
        }
       
    
    }
}