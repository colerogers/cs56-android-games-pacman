package com.example.jimmyle.pacmanandroid;

/**
 * Created by colerogers on 7/25/16.
 */
public class Pacman {
    //private instance vars
    private int xPos, yPos, curDir, nextDir;

    //create a new Pacman object at starting position
    public Pacman(final int blockSize){

        //Pacman is at the 8 position of length in the array x-dir
        //e.g. curMap[8,y]
        xPos = 8 * blockSize;

        //Pacman is at the 13 position of height in the array y-dir
        //e.g. curMap[x,13]
        yPos = 13 * blockSize;

        curDir = 2;
        nextDir = 4;
    }

    //public getters
    public int getXPos(){ return xPos; }
    public int getYPos(){ return yPos; }
    public int getCurDir(){ return curDir; }
    public int getNextDir(){ return nextDir; }

    //public setters
    public void setXPos(int xPos){ this.xPos = xPos; }
    public void setYPos(int yPos){ this.yPos = yPos; }
    public void setCurDir(int curDir){ this.curDir = curDir; }
    public void setNextDir(int nextDir){ this.nextDir = nextDir; }


}
