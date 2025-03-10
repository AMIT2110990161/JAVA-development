import java.util.ArrayList;

abstract class BankAccount implements Loanable{
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    abstract void calculateInterest();

    public void displayDetails() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount {
    private double interestRate = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println(getHolderName() + " earned interest : " + interest + ". New balance : " + balance);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println(getHolderName() + " applied for a loan of " + amount + " (Approved)");
        } else {
            System.out.println(getHolderName() + " applied for a loan of " + amount + " (Rejected)");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 5000;
    }


}

class CurrentAccount extends BankAccount {
    private double interestRate = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println(getHolderName() + " earned interest : " + interest + ". New balance : " + balance);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println(getHolderName() + " applied for a loan of " + amount + " (Approved)");
        } else {
            System.out.println(getHolderName() + " applied for a loan of " + amount + " (Rejected)");
        }    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 10000;
    }

}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("12345Ak", "Ankit", 4000.00);
        CurrentAccount current = new CurrentAccount("54321Ak", "Jerry", 12000.00);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savings);
        accounts.add(current);

        for (BankAccount account : accounts) {
            account.displayDetails();
            account.calculateInterest();
            account.deposit(1000);
            account.withdraw(500);

            System.out.println("---------------------------");
        }

        for(BankAccount account : accounts){
            if(account.calculateLoanEligibility()){
                account.applyForLoan(15000);
            }
        }
       
    }
}
