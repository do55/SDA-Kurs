package pl.sdacademy.streams_test;

/**
 * Created by maniek on 03.07.17.
 */
public class Person {
    int height;
    String eyesColour;
    String sex;

    public int getHeight() {
        return height;
    }

    public String getEyesColour() {
        return eyesColour;
    }

    public String getSex() {
        return sex;
    }

    public Person(int height, String eyesColour, String sex) {
        this.height = height;
        this.eyesColour = eyesColour;
        this.sex = sex;
    }
}
