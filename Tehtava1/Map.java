package Tehtava1;

import java.util.Scanner;

abstract public class Map {
    Tile[][] tiles;
    public Map(int row, int cols) {
        tiles =new Tile [row] [cols];

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                tiles[i][j]=createTile();
            }

        }
    }
    abstract public Tile createTile();

    public void display(){
        for(int i=0;i<tiles.length;i++){
            for(int j=0;j<tiles[i].length;j++){
                System.out.print(tiles[i][j].getCharacter()+ " ");
            }
            System.out.println();
        }
    }
}
