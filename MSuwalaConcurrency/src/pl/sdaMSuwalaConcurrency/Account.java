package pl.sdaMSuwalaConcurrency;

public class Account {

    private int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public synchronized void withdraw(int amount){
       while (this.amount < amount) {
           System.out.println("Za mało środków na koncie.");
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    this.amount -= amount;
        System.out.println("Wypłata zakończona. Stan konta: " + this.amount);
    }

    public synchronized void deposit(int amount){
        this.amount += amount;
        System.out.println("Zasilono konto kwotą: " + amount + ". Stan konta: " + this.amount);
        notify();
    }

    public int getAmount() {
        return amount;
    }
}
