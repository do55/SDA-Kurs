package pl.javasdaanaa;

import java.util.LinkedList;
import java.util.List;

public class AppStack <T> implements Stack<T>{

    private LinkedList<T> data = new LinkedList<>();

    @Override
    public void push(T number) {
            data.add(number);
        }


    @Override
    public T pop() {
        if (data.isEmpty()) {
            throw new RuntimeException("nie można wywołac tej metody na pustym stosie");
        }
        int number = data.size() - 1;
        T t = data.get(number);
        data.remove(number);
        return t;
        //zwraca info, co usunęliśmy ten obiekt
        //i możemy coś zrobić z tym obiektem
    }

    /*Override
    public T pop() {
    if (data.isEmpty()) {
    throw new EmptyStackException();
    }
    return data.pollLast();
     */

    @Override
    public T peek() {
        return data.peekLast();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
