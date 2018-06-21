package Lab5;

import java.text.NumberFormat;

/**
 * Created by Derrick on 2017-11-22.
 */
public class LLBankCustomer {

    private long account;
    private String name;
    private String phone;
    private double balance;

    public LLBankCustomer(long account, String name, String phone, double balance) {
        this.account = account;
        this.name = name;
        this.phone = phone;
        this.balance = balance;
    }

    public long getAccount() {
        return account;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        return account + "\t" + name + "\t" + formatter.format(balance) + "\t" + phone;
    }
}
