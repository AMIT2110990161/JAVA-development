package Level_02;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balence;

    public BankAccount(String accountHolder, long accountNumber, double balence) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balence = balence;
    }

    void depositeMoney(double amount){
        balence += amount;
        currBalence();
    }

    void withdrawMoney(double amount){
        if(balence >= amount){
            balence -= amount;
            currBalence();
        }
        else System.out.println("Inseficinet Balence");
    }

    void currBalence(){
        System.out.println("Your Current Balence : " + this.balence);
    }

    void fullDetails(){
        System.out.println("Name : " + accountHolder);
        System.out.println("Number : " + accountNumber);
        currBalence();
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Amit kumar", 2110990161, 5508956.36f);
        // ba.currBalence();
        ba.withdrawMoney(6985);
        ba.depositeMoney(35421);
        ba.fullDetails();
    }
}
