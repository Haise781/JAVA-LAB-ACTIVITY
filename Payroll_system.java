import java.util.Scanner;

public class Payroll_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter the number of hours worked in a week: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter the hourly pay rate: ");
        double payRate = scanner.nextDouble();

        System.out.print("Enter the federal tax withholding rate (as a decimal): ");
        double federalTaxRate = scanner.nextDouble();

        System.out.print("Enter the state tax withholding rate (as a decimal): ");
        double stateTaxRate = scanner.nextDouble();

        double grossPay = hoursWorked * payRate;
        double federalWithholding = grossPay * federalTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (" + (federalTaxRate * 100) + "%): $" + federalWithholding);
        System.out.println("  State Withholding (" + (stateTaxRate * 100) + "%): $" + stateWithholding);
        System.out.println("  Total Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);

        scanner.close();
    }
}
