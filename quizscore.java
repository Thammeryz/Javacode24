import java.util.Scanner;
/**
 * Write a description of class quizscore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class quizscore
{
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the quiz score 0-5 ");
        int quizScore = input.nextInt();
        
        if (quizScore < 0 || quizScore > 5) {
            System.out.println("Invalid input. Quiz score must be between 0 and 5.");
        } else {
            
            char grade = calcGrade(quizScore);

            System.out.println("Quiz Score: " + quizScore);
            System.out.println("Grade: " + grade);
        }
    }
     private static char calcGrade(int quizScore) {
        switch (quizScore) {
            case 5:
                return 'A';
            case 4:
                return 'B';
            case 3:
                return 'C';
            case 2:
                return 'D';
            case 1:
            case 0:
                return 'F';
            default:
                return ' ';
        }
    }
}
