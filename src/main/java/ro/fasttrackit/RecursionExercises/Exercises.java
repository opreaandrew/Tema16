package ro.fasttrackit.RecursionExercises;

public class Exercises {

    public static int sumOfFirst_n_integers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfFirst_n_integers(n - 1);
    }

    public static int sumOfFirst_n_EvenIntegers(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 != 0) {
            n--;
        }
        return n + sumOfFirst_n_EvenIntegers(n - 2);
    }

    public static String stringReverse(String word) { // not a check
        if (word.isEmpty()) {
            return word;
        }
        char firstChar = word.charAt(0);
        String restOfString = word.substring(1);
        return stringReverse(restOfString) + firstChar;
    }

    public static boolean palindromeFirstAndLastLetter(String word) {
        if (word.length() <= 1) {
            return true;
        }
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
        return (firstChar == lastChar) && palindromeFirstAndLastLetter(word.substring(1, word.length() - 1));
    }

    public static int sumOfDigits(int number) {
        if (number <= 10) {
            return number;
        }
        return number % 10 + sumOfDigits(number / 10);
    }

    public static long fibonacci(long number){
        if(number <= 1){
            return number;
        }
        return fibonacci(number-1) + fibonacci(number-2);
    }
}
