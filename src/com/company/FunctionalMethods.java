package com.company;

import java.util.Random;

public class FunctionalMethods {

    public int getRandomNumber(int max){
        Random random = new Random();
        return random.nextInt(max);
    }
}
