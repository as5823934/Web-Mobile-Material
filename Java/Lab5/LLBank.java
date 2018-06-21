package Lab5;

import java.util.Scanner;

/**
 * Created by Derrick on 2017-11-22.
 */
public class LLBank {

    private final int MAX = 30;
    private double INTEREST = 1.03; // 3 %
    private LLBankCustomer[] customers;
    private int count;

    public LLBank() {
        count = 0;
        customers = new LLBankCustomer[MAX];
        for(int i = 0; i < MAX; i++) {
            customers[i] = null;
        }
    }

    // createAccount
    public void createAccount() {
        System.out.println("================================");
        System.out.println("\nCREATING A NEW CUSTOMER ACCOUNT");
        System.out.println("Acount Number? ");
        Scanner in = new Scanner(System.in);
        int accountNumber = Integer.parseInt(in.nextLine());

        int index = findAccount(accountNumber);
        if (index != -1){
            System.out.println("Account Number already in use.");
        } else {
            System.out.println("Enter new customer's name: ");
            String name = in.nextLine();
            System.out.println("Enter new customer's phone#: ");
            String phone = in.nextLine();
            customers[count] = new LLBankCustomer(accountNumber, name, phone, 0);
            count++;
        }
    }
    // makeDeposit
    public void makeDeposit(){
        System.out.println("\nMAKING DEPOSIT");
        System.out.println("Acount Number? ");
        Scanner in = new Scanner(System.in);
        int accountNumber = Integer.parseInt(in.nextLine());
        int index = findAccount(accountNumber);
        if (index == -1) {
            System.out.println("Invalid Account number.");
        } else {
            System.out.println("Amount of deposit? ");
            double amount = Double.parseDouble(in.nextLine());
            if (amount > 0.0) {
                double original = customers[index].getBalance();
                customers[index].setBalance(original + amount);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }
    }

    // makeWithdraw

    public void makeWithdraw(){
        System.out.println("\nMAKING WITHDRAW");
        System.out.println("Acount Number? ");
        Scanner in = new Scanner(System.in);
        int accountNumber = Integer.parseInt(in.nextLine());
        int index = findAccount(accountNumber);
        if (index == -1) {
            System.out.println("Invalid Account number.");
        } else {
            System.out.println("Amount of withdrawal? ");
            double amount = Double.parseDouble(in.nextLine());
            if (customers[index].getBalance() >= amount) {
                if (amount > 0.0) {
                    double original = customers[index].getBalance();
                    customers[index].setBalance(original - amount);
                } else {
                    System.out.println("Invalid withdrawal amount");
                }
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public void addInterest() {
        System.out.println("\nADDING INTEREST");
        for(int i = 0; i < count; i++) {
            double original = customers[i].getBalance();
            customers[i].setBalance(original * INTEREST);
        }
    }

    // Searches for the specified account number. Return -1 if not found, otherwise return the index of the customer.
    public int findAccount(long accountNumber) {
        int result = -1;
        int index = 0;
        boolean found = false;

        while (index < count && !found) {
            if (accountNumber == customers[index].getAccount()) {
                found = true;
                result = index;
            }
            index++;
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "========BANK INFO========\n";
        for(LLBankCustomer customer: customers) {
            result += customer;
            result += "\n";
        }
        return result;
    }
}
