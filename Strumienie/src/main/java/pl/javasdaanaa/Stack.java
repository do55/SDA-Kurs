package pl.javasdaanaa;

public interface Stack <T> {

    //stos LIFO, push dodaje,pop usuwa, podgląda wartość


    void push(T number);
    T pop();

    T peek();

    int size();

    boolean isEmpty();
}
