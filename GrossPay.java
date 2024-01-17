
/**
 * Write a description of class Ques3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GrossPay
{
    public static void main(String[]args){
        double anu;
        anu = 32500;
        int paymounth = 24;
        int payweek = 26;
        double grospaymouth;
        double grospayweek;
        grospaymouth= anu/paymounth;
        grospayweek= anu/payweek;
        
        System.out.println("The annualy is "+ anu);
        System.out.println("Pay by Mounth is " + paymounth + " And Pay Week is "+ payweek);
        System.out.println("The Gross pay Mounth is " + grospaymouth + " And Goss pay week is "+ grospayweek );
        
        
        
        
        
        
    }
}
