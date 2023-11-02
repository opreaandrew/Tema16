package ro.fasttrackit.RecursionExercises;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static ro.fasttrackit.RecursionExercises.Exercises.*;

class ExercisesTest {

    @Test
    void sumOfFirst_n_integersTest() {
        assertThat(sumOfFirst_n_EvenIntegers(5)).isEqualTo(6);

    }

    @Test
    void sumOfFirst_n_EvenIntegersTest() {
        assertThat(sumOfFirst_n_EvenIntegers(7)).isEqualTo(12);
    }

    @Test
    void stringReverseTest() {
        assertThat(stringReverse("asdf")).isEqualTo("fdsa");
    }

    @Test
    void palindromeFirstAndLastLetterTest() {
        assertThat(palindromeFirstAndLastLetter("asdfdsa")).isEqualTo(true);
        assertThat(palindromeFirstAndLastLetter("adsa")).isEqualTo(false);
    }

    @Test
    void sumOfDigitsTest() {
        assertThat(sumOfDigits(1111)).isEqualTo(4);
        assertThat(sumOfDigits(321)).isEqualTo(6);
    }

    @Test
    void fibonacciTest() {
        assertThat(fibonacci(5)).isEqualTo(5L);
    }
}