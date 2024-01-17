import java.util.Scanner;
/**
 * Write a description of class Ques4 here.
 *
 * @author (THAMMER MUSSA - BITA/6/22/002/TZ)
 * @version (a version number or a date)
 */
public class Taxes
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double assrate = 60/100;
        double taxrate = 2.64;
        double assvalue;
        double anualtax;
        double actvalue;
        System.out.println("Enter the actual value of property");
        actvalue=input.nextDouble();
        assvalue = actvalue * assrate;
        anualtax = (assvalue/100)* taxrate;
        System.out.println("Your actual values is "+ actvalue);
        System.out.println("The assessed values is "+ assvalue);
        System.out.println("The annualy Tax is "+anualtax);
        
        
        
    }
}
