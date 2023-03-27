package src;

public class BankAccount {
    
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

 
}

