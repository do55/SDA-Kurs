package pl.sdacademy.singleton;

public class ThreadSafeSingletonCreatedUsingDoubleLocking {
    private static ThreadSafeSingletonCreatedUsingDoubleLocking INSTANCE;
    
    private ThreadSafeSingletonCreatedUsingDoubleLocking() {
        // empty
    }
    
    public static ThreadSafeSingletonCreatedUsingDoubleLocking getInstance() {
        if (null == INSTANCE) {
            synchronized (ThreadSafeSingletonCreatedUsingDoubleLocking.class) {
                if (null == INSTANCE) {
                    INSTANCE = new ThreadSafeSingletonCreatedUsingDoubleLocking();
                }
            }
        }
        return INSTANCE;
    }
}
