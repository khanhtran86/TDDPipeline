package org.example;

import java.util.Random;

/**
 * Hello world!
 */
public class PrimeNumber {
    public boolean check(int number) {
        if(number>=0 && number<=2){
            return false;
        }

        if(number<0)
        {
            throw new IllegalArgumentException();
        }

        boolean result = true;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                result = false;
            }
        }

        return result;
    }

    public int GetFibonaciNumber(int index)
    {
        Random rand = new Random();
        return rand.nextInt(index);
    }

    public int GetRandomNumber()
    {
        return 1;
    }

}
