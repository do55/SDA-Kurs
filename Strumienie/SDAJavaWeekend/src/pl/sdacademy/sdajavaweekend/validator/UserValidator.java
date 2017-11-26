package pl.sdacademy.sdajavaweekend.validator;

import pl.sda.sdajavaweekend.domain.Programmer;
import pl.sdacademy.sdajavaweekend.domain.User;

public class UserValidator {

    private static final Integer MIN_ALLOWED_USER_AGE = 18;
    private static final String EMPTY_PASSWORD = "";
    private static final Integer VALID_PHONE_NUMBER_LENGTH = 9;

    public static boolean validateAge(User user) {
        return user.getAge() > MIN_ALLOWED_USER_AGE;

    }


    public static boolean validatePassword(User user) {
        return EMPTY_PASSWORD.equals(user.getPassword());

    }

    public static boolean validePhoneNumber(User user) {
        return VALID_PHONE_NUMBER_LENGTH.equals(user.getTelephone().length());

    }

}
