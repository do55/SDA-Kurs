package pl.sdacademy;

interface ProcessValue<T> {
    void process(T value);
}

public class JavaUnusedLambdaParams {

    private static void doNothing() {
    }

    public static void main(String[] args) {

        ProcessValue<String> valueProcessor = t -> System.out.println(t);
        ProcessValue<String> valueProcessor2 = t -> {};
        ProcessValue<String> valueProcessor3 = System.out::println;
        ProcessValue<String> valueProcessor4 = t -> JavaUnusedLambdaParams.doNothing();
    }

}
