package com.company;

import java.util.Random;

public class Main {
    static int liczbaCzteroplatowcow = 1;
    static int liczbaTrzyplatowcow = 2;
    static int liczbaDwuplatowcow = 3;
    static int liczbaJednoplatowcow = 4;
    static int rozmiarPlanszy = 10;
    static Boolean[][] plansza = new Boolean[rozmiarPlanszy][rozmiarPlanszy];


    public static void main(String[] args) {

        try {
            rozmieszczenie(plansza, 4);
            rozmieszczenie(plansza, 3);
            rozmieszczenie(plansza, 3);
            rozmieszczenie(plansza, 2);
            rozmieszczenie(plansza, 2);
            rozmieszczenie(plansza, 2);
            rozmieszczenie(plansza, 1);
            rozmieszczenie(plansza, 1);
            rozmieszczenie(plansza, 1);
            rozmieszczenie(plansza, 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(plansza[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static Boolean[][] rozmieszczenie(Boolean[][] plansza, int rozmiar) throws InterruptedException {
        int x, x1;
        int y, y1;
        boolean permission;
        int count = 0;

        while (true) {
            permission = true;
            Random rand = new Random();
            x = rand.nextInt(rozmiarPlanszy - 1);
            y = rand.nextInt(rozmiarPlanszy - 1);
            if (plansza[x][y] == null) {
                for (int i = -1; i < 2; i++) {
                    if (!permission) {
                        break;
                    }
                    for (int j = -1; j < 2; j++) {
                        try {
                            if (plansza[x + i][y + j] != null) {
                                permission = false;
                                break;
                            }
                        } catch (ArrayIndexOutOfBoundsException ignored) {
                        }
                    }
                }
            }
            if (permission) {
                plansza[x][y] = true;
                count++;
                break;
            }
        }


            while (count < rozmiar){
            permission = true;
            Random rand = new Random();
            float r1 = rand.nextInt();
            Thread.sleep(100);
            float r2 = rand.nextFloat();

            if (r1 > 0.5) {
                x1 = (r1 > 0.5 ? 1 : -1) + x;
                y1 = y;
            } else {
                x1 = x;
                y1 = (r2 > 0.5 ? 1 : -1)+y;
            }

            if (x1 < 0 || y1 < 0 || x1 > 9 || y1 > 9){
                continue;
            }
           // System.out.println(x1 + " "+ x);
           //     System.out.println(y1 + " "+ y);
                //System.out.println(permission);
            try{
                if (plansza[x1][y1] == null){
                    for (int i = -1; i < 2; i++) {
                        if (!permission) {
                            //System.out.println("break2");
                            break;
                        }
                        for (int j = -1; j < 2; j++) {
                            try {
                                if (x1 + i == x && y1 + j == y){
                                    continue;
                                }
                                if (plansza[x1 + i][y1 + j] != null) {
                                    permission = false;
                                    //System.out.println("break1");
                                    break;
                                }
                            } catch (ArrayIndexOutOfBoundsException ignored) {
                            }
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException ignored){

            }

                if (permission) {
                    plansza[x1][y1] = true;
                    count++;
                    x = x1;
                    y = y1;
                }

        }
        return plansza;
    }
}
    /*public static Boolean[][] rozmieszczenie(int rozmiar, Boolean[][] plansza){
        for(int i = 0; i < rozmiar; i++){
            Random rand = new Random();
            int x = rand.nextInt(rozmiarPlanszy-1);
            int y = rand.nextInt(rozmiarPlanszy-1);
            if(plansza[x][y] == null){
                plansza[x][y] = true;
            }
        }
        return plansza;

    }
    }

    while(true){
            Random rand = new Random();
            if (count < rozmiar){
            x = rand.nextInt(x+1)+(x-1);
            y = rand.nextInt(y+1)+(y-1);
                if (plansza[x][y] == null) {
                    for (int i = -1; i < 2; i++) {
                        if (!permission) {
                            break;
                        }
                        for (int j = -1; j < 2; j++) {
                            try {
                                if (plansza[x + i][y + j] != null) {
                                    permission = false;
                                    break;
                                }
                            } catch (ArrayIndexOutOfBoundsException ignored) {
                            }
                        }
                    }
                }
                if (permission) {
                    plansza[x][y] = true;
                    count++;
                    break;
                }
            }
        }

*/