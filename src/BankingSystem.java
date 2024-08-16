import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account myAccount = new Account("John Doe", 1000.0);

        System.out.println("Welcome to the Banking System");
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + myAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double deposit = scanner.nextDouble();
                    myAccount.deposit(deposit);
                    System.out.println("Deposited $" + deposit);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdraw = scanner.nextDouble();
                    if (myAccount.withdraw(withdraw)) {
                        System.out.println("Withdrew $" + withdraw);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
