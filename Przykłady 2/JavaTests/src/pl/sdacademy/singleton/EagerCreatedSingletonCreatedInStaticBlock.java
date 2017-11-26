package pl.sdacademy.singleton;

public class EagerCreatedSingletonCreatedInStaticBlock {
    private static final EagerCreatedSingletonCreatedInStaticBlock INSTANCE;

    private EagerCreatedSingletonCreatedInStaticBlock() {
        // empty
    }

    public static EagerCreatedSingletonCreatedInStaticBlock getInstance() {
        return INSTANCE;
    }

    static {
        try {
            INSTANCE = new EagerCreatedSingletonCreatedInStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred during creation of new singleton instance");
        }
    }
}
