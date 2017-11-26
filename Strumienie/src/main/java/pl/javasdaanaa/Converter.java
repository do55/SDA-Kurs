package pl.javasdaanaa;

@FunctionalInterface

public interface Converter <F, T> {
    T convert (F from);
}
