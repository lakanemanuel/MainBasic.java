package task4;

public class task4 {
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        String original = str.toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();

        // Compare the original and reversed strings
        return original.equals(reversed);
    }
    public static void main(String[] args) {
     

    System.out.print("\033[H\033[2J");
    System.out.flush();

    String word1 = "hakunamatata"; 
      

        if (isPalindrome(word1)) {
            System.out.println("\"" + word1 + "\" input string is a palindrome.");
        } else {
            System.out.println("\"" + word1 + "\" input string is not a palindrome.");
        }

       
    }
}