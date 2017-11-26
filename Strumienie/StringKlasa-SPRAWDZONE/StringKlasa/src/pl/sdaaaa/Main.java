package pl.sdaaaa;

public class Main {

    public static void main(String[] args) {


        if (isPalindrome("szafa")) {
            System.out.println("To jest palindrom");
        } else {
            System.out.println("To nie jest palindrom");
        }

        String number = ",4";
        if (isNumber(number) == true) {
            System.out.println(number + " jest liczbą");
        } else {
            System.out.println(number + " nie jest liczbą");

        }
    }

    private static boolean isNumber(String word) {
        int counter = 0;
        int counter1 = 0;

        //@RW można uprościć ten blok 'for'
        // Jęśli znaleziony zostanie pierwszy znak, który nie jest cyfrą bądź ',' od razy zwracamy 'false'.
        // Optymalizujemy wykonanie aby nie wykonywać zbędnego przetwarzania
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);

            if (a == ',' || a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9') {
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
        //@RW czy na pewno potrzebujesz tę zmienną ;)

        boolean palindrome = (a == b);
        while (endIndex > beginIndex && palindrome) {
            word.charAt(beginIndex);
            word.charAt(endIndex);
            endIndex--;
            beginIndex++;
        }
        //@RW czy na pewno potrzebujesz zmienne a i b ;)
        // unikaj nazywania jakichkolwiek zmiennych na zasadzie 'a', 'xx' itp. KONIECZNIE :)
        if (beginIndex == endIndex) {
            return true;
        }
        return false;
    }
}



