package pl.sdacademy.singleton;

public class SingletonByBillPugh {
    private SingletonByBillPugh() {
        // empty
    }
    
    private static class SingletonHelper {
        private static final SingletonByBillPugh INSTANCE = new SingletonByBillPugh();
        static {
            System.out.println("SingletonHelper - static block");
        }
    }
    
    public static SingletonByBillPugh getInstance() {
        System.out.println("inside getInstance()");
        return SingletonHelper.INSTANCE;
    }
    
    public static void print() {
    	System.out.println("print() from SingletonByBillPugh");
    }
    static {
        System.out.println("Inside static block of SingletonByBillPugh");
    }
}
