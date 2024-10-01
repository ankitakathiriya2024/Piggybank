
import java.util.Scanner;

class User {
    private String username;
    private String accountnumber;
    private double totalAmount;

    // Constructor
    public User(String username, String accountNumber) {
        this.username = username;
        this.accountnumber = accountNumber;


    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be greater than zero.");
            return;
        }

    }

    // Withdrawal method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
            return;
        }
        if (amount > totalAmount) {
            System.out.println("Error: Cannot withdraw more than available balance.");
            return;
        }
        if ((totalAmount - amount) < totalAmount * 0.1) {
            System.out.println("Error: Cannot leave less than 10% balance.");
            return;
        }

    }




    // Show user details
    public void showUserDetails() {
        System.out.println("User: " + username);
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Total Balance: $" + totalAmount);
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("Welcome to Internet Banking!");
        System.out.println("****************************");

        // User Input Detail

        System.out.println("Enter Your User name:  ");
        String username = sc.nextLine();
        System.out.println("Welcome, " + username + "!");

        System.out.println("Enter Your Account Number:  ");
        String accountnumber = sc.nextLine();


    }

}

