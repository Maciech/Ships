package com.company;
import java.util.ArrayList;
import java.util.List;

public class ShipsGame extends FunctionalMethods{
    private static final int DIMENSION = 10;
    private static int monoPlane = 4;
    private static int biPlane = 3;
    private static int triPlane = 2;
    private static int quadPlane = 1;
    private static boolean emptyArea;
    private CellProperties[][] cellObject = new CellProperties[DIMENSION][DIMENSION];

    public void createGame(){

        for (int x = 0; x < DIMENSION; x++){
            for (int y = 0; y < DIMENSION; y++){
                cellObject[x][y] = new CellProperties(x,y,false);


                }
            }
        createShip();
        }
    private void getNeighbours(CellProperties cellProperties) {
        List<Boolean> result = new ArrayList<>();
        emptyArea = true;

        for (int x = cellProperties.x - 1; x < cellProperties.x + 1; x++) {
            for (int y = cellProperties.y - 1; y < cellProperties.y; y++) {
                if (x >= DIMENSION || x < 0) {
                    continue;
                }
                if (y >= DIMENSION || y < 0) {
                    continue;
                }
                if (cellProperties == cellObject[x][y]) {
                    continue;
                }
                //result.add(cellObject[x][y].isShip);
            }
        }
        for (Boolean neighbours : result) {
            if (neighbours) {
                emptyArea = false;
            }
        }
        System.out.println(emptyArea);
    }

    public void createShip(){
        int ShipValue = getRandomNumber(4);
        CellProperties cellProperties = cellObject[getRandomNumber(9)][getRandomNumber(9)];
        getNeighbours(cellProperties);
        if (ShipValue == 0){
            createShip();
        } if (ShipValue == 1 && !cellProperties.isShip && emptyArea && monoPlane != 0){
            cellProperties.isShip = true;
            monoPlane--;
        } if (ShipValue == 2 && !cellProperties.isShip && emptyArea && biPlane != 0) {
            cellProperties.isShip = true;
            biPlane--;
        } if (ShipValue == 3 && !cellProperties.isShip && emptyArea && triPlane != 0){
            cellProperties.isShip = true;
            triPlane--;
        } if (ShipValue == 4 && !cellProperties.isShip && emptyArea && quadPlane != 0){
            cellProperties.isShip = true;
            quadPlane--;
        }


    }

    private void createNeighbourShip(CellProperties cellProperties){


    }
    }

