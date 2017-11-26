package pl.javasdaanaa;

public class GenericPair<T,V> {

    //typ klasy generyczny, bo może przyjąć rózne typy
    //inaczej bysmy mieli typ Object i za każdym razem castować
    //nie tylko instancje klasy something, tylko instancji i T i V
    //Obiekt, który ma dwa obiekty w sobie, jak siedem to byłaby już lista

    public GenericPair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    private T first;
    private V second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
