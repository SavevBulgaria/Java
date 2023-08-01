package OOP20_4;

class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }
}

public class Main20 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000.0);

        System.out.println("Account Balance: " + account.getBalance());

        account.setBalance(-500.0);
        System.out.println("Account Balance: " + account.getBalance());
    }
}
