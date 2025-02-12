package practiceProblem_Weak02.Tuesday_11_feb_2025.Access_Modifiers;

public class BankAccount {
    public long accountNumber;  // Public attribute
    protected String accountHolder;  // Protected attribute
    private double balance;     // Private attribute

    // Constructor to initialize account details
    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {
        // Creating a bank account
        BankAccount account = new BankAccount(1234567890L, "John Doe", 1000.0);
        account.displayAccountInfo();

        // Modifying balance using public method
        account.setBalance(2000.0);
        System.out.println("\nUpdated Account Info:");
        account.displayAccountInfo();
    }

}
