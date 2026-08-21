import java.util.Scanner;

public class Main {

    static class BankAccount {
        double balance;
        final double MIN_BALANCE = 500;
        final double MAX_WITHDRAWAL = 10000;

        BankAccount(double balance) {
            this.balance = balance;
        }

        void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Constraint: Amount must be greater than 0.");
            } else {
                balance += amount;
                System.out.println("Deposit successful.");
            }
        }

        void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Constraint: Amount must be greater than 0.");
            } 
            else if (amount > MAX_WITHDRAWAL) {
                System.out.println("Constraint: Maximum withdrawal is ₹10,000.");
            } 
            else if (balance - amount < MIN_BALANCE) {
                System.out.println("Constraint: Minimum balance of ₹500 must be maintained.");
            } 
            else {
                balance -= amount;
                System.out.println("Withdrawal successful.");
            }
        }

        void checkBalance() {
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        if (initialBalance < 500) {
            System.out.println("Initial balance must be at least ₹500.");
            return;
        }

        BankAccount account = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

output:
Enter initial balance: 3000

--- Banking System ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 1
Enter deposit amount: 500
Deposit successful.

--- Banking System ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 2
Enter withdrawal amount: 100
Withdrawal successful.

--- Banking System ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 3
Current Balance: ?3400.0

--- Banking System ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 4
Thank you!

=== Code Execution Successful ===