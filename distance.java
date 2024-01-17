import java.util.Scanner;
/**
 * Write a description of class distance here.
 *
 * @author (THAMEER)
 * @version (a version number or a date)
 */
public class distance
{
     public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        System.out.print("What is the speed of the vehicle in mph? ");
        int speed = input.nextInt();
        System.out.print("How many hours has it traveled? ");
        int hours = input.nextInt();
        System.out.println("\nHour\tDistance Traveled");
        for (int i = 1; i <= hours; i++) {
            int distance = speed * i;
            System.out.println(i + "\t\t" + distance);
        }

    
    }
    
    
}
