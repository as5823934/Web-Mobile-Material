package ch5_pp;

public class Transaction {
    public static void main(String[] args) {
        Account acc1 = new Account("Elif", 11234, 100000);
        Account acc2 = new Account(11111, "Hunter");

        acc1.withdraws(9000, 10);
        acc1.deposit(500);
        acc1.getBalance();
        acc1.addInterest();


        System.out.println(acc1);
        System.out.println(acc2);

    }
}