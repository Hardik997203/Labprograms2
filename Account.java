package banksys;
import java.util.*;
class Account {
    private int AccountNo;
    private String name;
    private double balance;

  
    public Account(int accountNo, String name, double balance) {
        this.AccountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new ArithmeticException("Enter positive amount to deposit");
        }
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

  
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new ArithmeticException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance! Available: " + balance);
        }
        balance = balance - amount;
        System.out.println("Amount Withdrawn: " + amount);
    }

   public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}