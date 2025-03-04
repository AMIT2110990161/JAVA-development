package practiceProblem_Weak02.Thrusday_13_feb_2025.AssistedProblems;

import java.util.ArrayList;

class Bank {
    String name;
    ArrayList<Customer> customers = new ArrayList<>();

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer) {
        customers.add(customer);
    }
}

class Customer {
    String name;
    ArrayList<Bank> banks = new ArrayList<>();
    double balance;

    Customer(String name) {
        this.name = name;
    }

    void addBank(Bank bank) {
        banks.add(bank);
        bank.openAccount(this);
    }

    void viewBalance() {
        System.out.println("Customer: " + name + ", Balance: " + balance);
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank("XYZ Bank");
        Customer customer = new Customer("John");
        customer.addBank(bank);
        customer.viewBalance();
    }
}

