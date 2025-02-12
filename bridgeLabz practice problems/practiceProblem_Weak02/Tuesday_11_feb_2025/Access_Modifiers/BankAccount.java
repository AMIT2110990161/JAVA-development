package practiceProblem_Weak02.Tuesday_11_feb_2025.Access_Modifiers;

public class BankAccount {
    public long accountNumber;  // Public attribute
    protected String accountHolder;  // Protected attribute
    private double balance;     // Private attribute

    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1234567890L, "John Doe", 1000.0);
        account.displayAccountInfo();

        account.setBalance(2000.0);
        System.out.println("\nUpdated Account Info:");
        account.displayAccountInfo();
    }

}
