package com.company;

public class CellProperties extends ShipsGame{
    public int x, y;
    public boolean isOpen, isShip, isMono, isBi, isTri, isQuad;
    CellProperties(int x, int y, boolean isShip){
        this.x = x;
        this.y = y;
        this.isShip = isShip;
    }
}
