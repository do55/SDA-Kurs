package pl.sdacademy.singleton;

public class LazyCreatedSingleton {
    private static LazyCreatedSingleton INSTANCE;
    
    private LazyCreatedSingleton() {
        // empty
    }
    
    public static LazyCreatedSingleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new LazyCreatedSingleton();
        }
        
        return INSTANCE;
    }
}
