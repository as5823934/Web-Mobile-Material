package Lab5;

/**
 * Created by Derrick on 2017-11-22.
 */
public class LLBankDriver {
    public static void main(String[] args) {

        System.out.println("Welcome to the L & L Bank.\n");

        LLBank bank = new LLBank();

        bank.createAccount();
        bank.makeDeposit();
        bank.createAccount();
        bank.makeDeposit();
        bank.createAccount();
        bank.makeDeposit();
        bank.makeWithdraw();

        System.out.println("\nCurrent Bank Status");
        System.out.println(bank);

        bank.makeWithdraw();
        bank.addInterest();

        System.out.println("\nFinal Bank Status");
        System.out.println(bank);

    }
}
