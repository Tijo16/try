import java.util.Scanner;

class BankCustomer {
    private String name;
    private int accountNumber;
    private double balance;

    public BankCustomer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: Rs. " + balance);
    }

    public void withdraw(double amount) {
        if (amount >= 500) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: Rs. " + balance);
        } else {
            System.out.println("Withdrawal failed. Minimum withdrawal amount is Rs. 500");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class try1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        BankCustomer customer = new BankCustomer(name, accountNumber);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: Rs. ");
                    double depositAmount = scanner.nextDouble();
                    customer.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    double withdrawalAmount = scanner.nextDouble();
                    customer.withdraw(withdrawalAmount);
                    break;

                case 3:
                    System.out.println("Current balance: Rs. " + customer.getBalance());
                    break;

                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}