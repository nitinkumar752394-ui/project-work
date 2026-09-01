import java.util.Scanner;

public class AccountManagementSystem {

    void function() {

        String name;
        long accountNo;
        double balance = 0;
        double deposit;
        double withdraw;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        name = sc.nextLine();

        System.out.println("Enter the account number:");
        accountNo = sc.nextLong();

        System.out.println("Enter your deposit amount:");
        deposit = sc.nextDouble();

        if (deposit > 0) {
            balance = balance + deposit;
            System.out.println("Total balance after deposit: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }

        System.out.println("Enter withdrawal amount:");
        withdraw = sc.nextDouble();

        if (withdraw > 0 && withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Total balance after withdrawal: " + balance);
        } else if (withdraw > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }

        System.out.println("\nAccount Holder: " + name);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Final Balance: " + balance);

        sc.close();
    }

    public static void main(String[] args) {
        AccountManagementSystem acc = new AccountManagementSystem();
        acc.function();
    }
}

