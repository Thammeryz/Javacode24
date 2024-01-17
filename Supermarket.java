import java.util.Scanner;
/**
 * Write a description of class Supermarket here.
 *
 * @author (THAMEER)
 * @version (a version number or a date)
 */
public class Supermarket
{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        final double OVERTIME_RATE = 1.5;
        final double TAX_RATE = 0.15;
        final double PARKING_CHARGE = 20.0;
        final double MAX_REGULAR_HOURS = 40.0;

       
        System.out.print("Enter employee's ID number: ");
        int employeeId = input.nextInt();

        System.out.print("Enter hourly rate of pay: $");
        double hourlyRate = input.nextDouble();

        System.out.print("Enter number of hours worked for the week: ");
        double hoursWorked = input.nextDouble();

        
        double grossPay = calculateGrossPay(hourlyRate, hoursWorked, MAX_REGULAR_HOURS, OVERTIME_RATE);

        double incomeTax = calculateIncomeTax(grossPay, TAX_RATE);
        double deductions = incomeTax + PARKING_CHARGE;

  
        double netPay = grossPay - deductions;


        System.out.println("\nEmployee Payroll Summary:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Income Tax: $" + incomeTax);
        System.out.println("Parking Charge: $" + PARKING_CHARGE);
        System.out.println("Deductions: $" + deductions);
        System.out.println("Net Pay: $" + netPay);

        
    }

    private static double calculateGrossPay(double hourlyRate, double hoursWorked, double maxRegularHours, double overtimeRate) {
        double regularPay = Math.min(hoursWorked, maxRegularHours) * hourlyRate;
        double overtimePay = Math.max(0, hoursWorked - maxRegularHours) * overtimeRate * hourlyRate;
        return regularPay + overtimePay;
    }

    private static double calculateIncomeTax(double grossPay, double taxRate) {
        if (grossPay > 500.0) {
            return grossPay * taxRate;
        } else {
            return 0.0;
        }
    }
}
