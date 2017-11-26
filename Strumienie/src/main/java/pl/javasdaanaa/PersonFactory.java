package pl.javasdaanaa;

import java.util.Arrays;
import java.util.Optional;

import static java.util.Optional.of;

public class PersonFactory implements Human {

    public Human getHumanInstance (HumanType humanType) {

        switch (humanType) {
            case STUDENT:
                return new Optional.of(new Student());
        }

    }
}