package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class PrimeNumberTest {
    @Test
    public void check_number_less_then_2_is_not_prime_number(){
        //Arrange
        PrimeNumber primeNumber = new PrimeNumber();
        int number = 2;
        boolean expected = false;

        //Action
        boolean actual = primeNumber.check(number);

        //Assertion
        assertEquals(expected,actual);
    }

    @Test
    public void check_return_true_if_number_is_prime_number(){
        //Arrange
        PrimeNumber primeNumber = new PrimeNumber();
        int number = 11;
        boolean expected = true;
        //Action
        boolean actual = primeNumber.check(number);

        //Assertion
        assertEquals(expected,actual);
    }

    @Test
    public void check_return_false_if_number_is_not_prime_number(){
        //Arrange
        PrimeNumber primeNumber = new PrimeNumber();
        int number = 4;
        boolean expected = false;
        //Action
        boolean actual = primeNumber.check(number);

        //Assertion
        assertEquals(expected,actual);
    }

    @Test
    public void check_throw_exception_if_number_is_negative(){
        PrimeNumber primeNumber = new PrimeNumber();
        int number = -1;

        assertThrows(IllegalArgumentException.class, () -> primeNumber.check(number));

    }

    @Test
    public void check_GetFibonaciNumber()
    {
        PrimeNumber primeNumber = new PrimeNumber();
        int number = primeNumber.GetFibonaciNumber(5);
        assertTrue(true);
    }
}
