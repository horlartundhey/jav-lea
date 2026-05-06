import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        double balance = 10000.00; 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: ");

        boolean isRunning = true;

        while (isRunning) {

            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Checking Balance...");
                System.out.println("Your current balance is: $" + balance);
            }else if (choice == 2) {
                System.out.println("Enter Amount to Deposit:");                
                double amount = scanner.nextDouble();
                if (amount <= 0) {
                    System.out.println("Invalid amount");
                }else{
                    balance += amount;
                    System.out.println("Deposit successful. Your new balance is: $" + balance);
                }

            }else if (choice == 3) {
                System.out.println("Enter Amount to Withdraw:");
                double amount = scanner.nextDouble();
                if (amount <=0) {
                    System.out.println("Invalid amount");
                }else if (amount > balance) {
                    System.out.println("This amount is more than the balance you have in your account");                    
                }else{
                    balance -= amount;
                    System.out.println("Withdrawal successful. Your new balance is: $" + balance);
                }
            }else if (choice == 4) {
                System.out.println("Exiting...");
                isRunning = false;
            }           
        }
        scanner.close();
    }
}