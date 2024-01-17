import java.util.Scanner;
/**
 * Write a description of class Ques2 here.
 *
 * @author (THAMEER MUSSA- BITA/6/22/002/TZ)
 * @version (a version number or a date)
 */

public class Playgame
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        String name;
        String city;
        String college;
        String prof;
        String animal;
        String petname;
        int age;
        
        System.out.println("Enter your name please ");
        name = input.nextLine();
        System.out.println("Enter your city please ");
        city = input.nextLine();
        System.out.println("Enter your college please ");
        college = input.nextLine();
        System.out.println("Enter your Professional please ");
        prof = input.nextLine();
        System.out.println("Enter a name of the Animal ");
        animal = input.nextLine();
        System.out.println("Enter a name of pet");
        petname = input.nextLine();
        System.out.println("Enter your Age please ");
        age = input.nextInt();
        
        System.out.print("There once was a person named "+ name +" who lived in " + city + ". at the age of " +age+ " , " +name+ " when to collage at " + college+ "." +name+ " graduated and went to wwork as " + prof+ ". Then ," + name+ " adapted an  " + animal+ "named " +petname+ " . they both lived happily ever after!");
    }
}
