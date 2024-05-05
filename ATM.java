import java.util.Scanner;

public class ATM {
    private static double balance = 500; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM");
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid amount.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: $" + balance);
    }
}
