package practiceProblem_Weak02.Tuesday_11_feb_2025.AccessModifiers.BankAccountManagement;

class SavingsAccount extends BankAccount {
    public SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber); // Accessible (public)
        System.out.println("Account Holder: " + accountHolder); // Accessible (protected)
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(123456789, "Alice Smith", 5000.0);
        sa.displayAccountDetails();
        System.out.println("Balance: " + sa.getBalance());
    }
}
