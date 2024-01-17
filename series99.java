import java.util.Scanner;
/**
 * Write a description of class series99 here.
 *
 * @author (THAMEER)
 * @version (a version number or a date)
 */
public class series99
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a series of integer -99 to end");
        int no = input.nextInt();
        int larg = no;
        int small = no;
        while(no!= 99){
            if (no > larg){
                larg = no;
                
            }
            if(no<small){
                small= no;
            }
            no = input.nextInt();
        }
        System.out.println("Largest number"+larg);
        System.out.println("Smallest number"+small);
    }
    
    
}
