import java.util.Scanner;

public class SalaryTransformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.12;

        double gross = basic + hra + da;
        double tax = gross * 0.05;
        double net = gross - pf - tax;

        System.out.println("\n--- Salary Details ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
        System.out.println("PF Deduction: " + pf);
        System.out.println("Tax Deduction: " + tax);
        System.out.println("Net Salary: " + net);

        sc.close();
    }
}


input:
Enter Employee Name: Rahul
Enter Basic Salary: 30000

output:
--- Salary Details ---
Employee Name: Rahul
Basic Salary: 30000.0
HRA: 6000.0
DA: 3000.0
Gross Salary: 39000.0
PF Deduction: 3600.0
Tax Deduction: 1950.0
Net Salary: 33450.0