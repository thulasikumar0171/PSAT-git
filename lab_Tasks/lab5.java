import java.util.Scanner;

public class BankingTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000;

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount: ");
                double deposit = sc.nextDouble();

                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Deposit successful");
                } else {
                    System.out.println("Invalid amount");
                }
                break;

            case 2:
                System.out.print("Enter amount: ");
                double withdrawal = sc.nextDouble();

                if (withdrawal > 0 && withdrawal <= balance) {
                    balance -= withdrawal;
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Invalid amount or insufficient balance");
                }
                break;

            case 3:
                System.out.println("Balance: " + balance);
                break;

            default:
                System.out.println("Invalid choice");
        }

        System.out.println("Final Balance: " + balance);
        sc.close();
    }
}

Input:

Enter choice: 1
Enter amount: 500

Output:

Deposit successful
Final Balance: 1500.0