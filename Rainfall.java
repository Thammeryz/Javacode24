import java.util.Scanner;
/**
 * Write a description of class Rainfall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rainfall
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numYears = input.nextInt();
        double totalRainfall = 0;
        int totalMonths = 0;
        for (int year = 1; year <= numYears; year++) {
     
            for (int month = 1; month <= 12; month++) {
                System.out.print("Enter inches of rainfall for Year " + year + ", Month " + month + ": ");
                double inches = input.nextDouble();
                totalRainfall += inches;
                totalMonths++;
            }
        }

        double averageRainfall = totalRainfall / totalMonths;
        System.out.println("\nResults:");
        System.out.println("Number of months: " + totalMonths);
        System.out.println("Total inches of rainfall: " + totalRainfall);
        System.out.println("Average rainfall per month: " + averageRainfall + " inches");
    }
}
