package pl.sdacademy.singleton;

public class CostlyThreadSafeSingleton {
    private static CostlyThreadSafeSingleton INSTANCE;
    
    private CostlyThreadSafeSingleton() {
        // empty
    }

    public static synchronized CostlyThreadSafeSingleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new CostlyThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
