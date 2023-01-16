package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount{

    public static double interest =1.8;
    public static double duration =6.0;

    public FixedDepositAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("No Operation");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("No Operation");
    }

    @Override
    public void showAccount() {
        System.out.println("Account No: " +this.getAccountNo());
        System.out.println("Full Name: " +this.getFullName());
        System.out.println("Balance: " +this.getBalance()*(100+interest)/100);
    }
}
