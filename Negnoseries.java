import java.util.Scanner;
/**
 * Write a description of class Negnoseries here.
 *
 * @author (THAMEER MUSSA)
 * @version (a version number or a date)
 */
public class Negnoseries
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter positive numbers");
        int no;
        while((no = input.nextInt())>=0){
            sum += no;
        }
        System.out.println("Sum of positive number is "+sum);
    }
    
    
}
