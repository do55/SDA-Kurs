package pl.sdaMSuwalaConcurrency;

public class AccountMain {

    public static void main(String[] args) {

        Account account = new Account(1000);

        new Thread(() -> {
            account.withdraw(2000);
        }).start();

        new Thread(() -> {
            account.deposit(500);
        }).start();

        new Thread(() -> {
            account.deposit(400);
        }).start();

        new Thread(() -> {
            account.deposit(200);
        }).start();
    }
}
