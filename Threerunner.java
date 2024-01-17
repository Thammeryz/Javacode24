import java.util.Scanner;
/**
 * Write a description of class Threerunner here.
 *
 * @author (THAMEER)
 * @version (a version number or a date)
 */
public class Threerunner
{
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] runnerNames = new String[3];
        double[] finishingTimes = new double[3];

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of runner " + (i + 1) + ": ");
            runnerNames[i] = input.nextLine();
            System.out.print("Enter the finishing time for " + runnerNames[i] + " (in minutes): ");
            finishingTimes[i] = input.nextDouble();
            input.nextLine(); 
        }
        int minIndex = findMinIndex(finishingTimes);

        System.out.println("\nRace Results:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + runnerNames[minIndex] + " - " + finishingTimes[minIndex] + " minutes");
            finishingTimes[minIndex] = Double.MAX_VALUE;
            minIndex = findMinIndex(finishingTimes);
        }
    }

   
    private static int findMinIndex(double[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
