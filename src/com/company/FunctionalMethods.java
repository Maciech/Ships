package com.company;

import java.util.Random;

public class FunctionalMethods {

    public int getRandomNumber(int max){
        Random random = new Random();
        return random.nextInt(max);
    }
    public int getRandomNumber(int min, int max){
        Random random = new Random();
        int wynik = random.nextInt(max + 1 - min) + min;
        return wynik;
    }
}
