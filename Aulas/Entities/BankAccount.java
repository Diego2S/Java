package Entities;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;


    public BankAccount(String accountHolder, int accountNumber, double inicialDeposit){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        depositValue(inicialDeposit);
    }

    public BankAccount(String accountHolder, int accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void depositValue(double amount){
        this.balance += amount;
    }

    public void withdrawvalue(double amount){
        this.balance -=  amount + 5;
    }

    @Override
    public String toString() {
        return String.format("Acount data:\n" +
                "Acount %d, Holder: %s, Balance: $ %.2f",accountNumber,accountHolder,balance);
    }
}
