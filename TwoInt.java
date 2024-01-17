import java.util.Scanner;
/**
 * Write a description of class TwoInt here.
 *
 * @author (THAMEER MUSSA )
 * @version (a version number or a date)
 */
public class TwoInt
{
    public static void main(String[] args) {
        Scanner inpot= new Scanner(System.in);
        System.out.print("Enter a two digit integer ");
        String input= inpot.nextLine();
        if (input.length() != 2) {
            System.out.println("Invalid input. Please enter a two-digit integer.");
            return;
        }
        int x = Integer.parseInt(input);
        int rightmostDigit = x % 10;
        int leftmostDigit = x / 10;
        int y = rightmostDigit * 10 + leftmostDigit;
        System.out.println("Original number (x): " + x);
        System.out.println("Reversed number (y): " + y);
        System.out.println("Sum (x + y): " + (x + y));

    }
}
