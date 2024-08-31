package oops;

public class BankAccount extends Person {
    Integer accountId;
    double balance;

    public BankAccount(Integer accountId) {
        this.accountId = accountId;
    }

    public BankAccount(Integer accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}
