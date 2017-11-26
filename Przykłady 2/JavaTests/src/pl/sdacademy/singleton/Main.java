package pl.sdacademy.singleton;

public class Main {
    public static void main(String[] args) {
    	System.out.println("Inside main()"); 
        SingletonByBillPugh.print();
        SingletonByBillPugh.getInstance();
    }
}
