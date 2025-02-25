package practiceProblem_Weak02.Tuesday_11_feb_2025.AccessModifiers.BankAccountManagement;

class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

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

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(987654321, "Bob Williams", 10000.0);
        System.out.println("Initial Balance: " + ba.getBalance());
        ba.setBalance(12000.0);
        System.out.println("Updated Balance: " + ba.getBalance());
    }
}
