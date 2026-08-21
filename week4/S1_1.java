import java.util.Scanner;

public class Main {

    static class BankAccount {
        String name;
        long accountNumber;
        double balance;

        BankAccount(String name, long accountNumber, double balance) {
            this.name = name;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount deposited successfully!");
            } else {
                System.out.println("Invalid amount.");
            }
        }

        void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Amount withdrawn successfully!");
            } else if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                System.out.println("Invalid amount.");
            }
        }

        void checkBalance() {
            System.out.println("Current Balance: ₹" + balance);
        }

        void displayAccount() {
            System.out.println("\n--- Account Details ---");
            System.out.println("Account Holder: " + name);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount account =
                new BankAccount(name, accountNumber, balance);

        int choice;

        do {
            System.out.println("\n===== BANKING TRANSACTION SYSTEM =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.displayAccount();
                    break;

                case 5:
                    System.out.println("Thank you for using the banking system!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}