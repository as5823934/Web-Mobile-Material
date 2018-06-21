package ch5_pp;

public class Account {
    private final double RATE = 0.035;
    private String name;
    private long accountNumber;
    private double balance; //belong to instance
    public static int users = 0; //static belong to class

    public Account(String name, long accountNumber, double balance){
        //use (this) if want to use same name
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //we can use many constructors
    public Account(long accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    //deposit
    public double deposit(double amount) {
        if (amount > 0){
            balance += amount;
        }
        return balance;
    }

    //Withdraws
    public double withdraws(double amount, double fee){
        if(amount + fee > 0 && amount + fee <= balance){
            balance -= amount + fee;
        }
        return balance;
    }

    //interest
    public double addInterest() {
        balance += balance * RATE;
        return balance;
    }


    //return balance fo this account
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return ("Name : " + name + "\nAccountNumber :  " + accountNumber + " \n$ " + balance);
    }
}
