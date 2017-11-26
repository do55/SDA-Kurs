package pl.javasdaanaa;

public class SingletonTut {

    private static final SingletonTut INSTANCE = new SingletonTut();

    private SingletonTut() {}

    public static SingletonTut getInstance() {
        return INSTANCE;
    }

    /* lub LAZY INITIALIZE - utworzy dopiero utworzy, kiedy zostanie poproszony

    public static SingletonTut getInstance() {
    if (INSTANCE == null) {
        INSTANCE = new SingletonTut();
        return INSTANCE;
    }

 */


}
