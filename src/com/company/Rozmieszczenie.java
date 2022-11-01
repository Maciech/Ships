package com.company;

public class Rozmieszczenie extends Main{
    public static int[][] placing(int[][] plansza){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(plansza[i][j] + " ");
            }
            System.out.println();
        }



        return plansza;
    }
}
