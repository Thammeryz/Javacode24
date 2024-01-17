import java.util.Scanner;
/**
 * Write a description of class Palindrome here.
 *
 * @author (THAMEER)
 * @version (a version number or a date)
 */
public class Palindrome
{
      public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a five-digit integer: ");
        int number = input.nextInt();

       
        if (number < 10000 || number > 99999) {
            System.out.println("Invalid input. Please enter a five-digit integer.");
            return;
        }

       
        boolean isPalindrome = checkPalindrome(number);

       
        System.out.println("Is the number a palindrome? " + (isPalindrome ? "Yes" : "No"));

        
    }

    private static boolean checkPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
