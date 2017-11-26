package pl.sdaaaa;

public class Main {

    public static void main(String[] args) {


        if (isPalindrome("kejak")) {
            System.out.println("To jest palindrom");
        } else {
            System.out.println("To nie jest palindrom");
        }

        String number = ",2,7";
        if (isNumber(number) == true) {
            System.out.println(number + " jest liczbą");
        } else {
            System.out.println(number + " nie jest liczbą");

        }
    }

    private static boolean isNumber(String word) {
        int counter1 = 0;
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            if (a == ',' || a >= '0' || a <= '9') {
            counter1++;
            }
            if (a == ',') {
                counter++;
            }
        }

        if ((counter <= 1) && (counter1 == word.length())) {
            return true;
        }

        return false;
    }


    private static boolean isPalindrome(String word) {
        int endIndex = word.length() - 1;
        int beginIndex = 0;
        boolean palindrome = true;
        while (endIndex > beginIndex && palindrome) {
            palindrome = (word.charAt(beginIndex) == word.charAt(endIndex));
            endIndex--;
            beginIndex++;
        }
        if (palindrome) {
            return true;
        }
        return false;
    }
}



