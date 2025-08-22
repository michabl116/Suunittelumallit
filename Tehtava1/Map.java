package Tehtava1;


 public abstract class Map { //// Define una clase abstracta llamada Map, que no puede ser instanciada directamente
Tile[][] tiles; //// Declara una matriz bidimensional de objetos Tile, que representa el mapa



// Constructor que recibe el número de filas y columnas del mapa
public Map(int row, int cols) {
        tiles =new Tile [row] [cols];

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                tiles[i][j]=createTile();// Asigna un nuevo Tile creado por el métod abstracto createTile()

            }

        }
    }

     public abstract Tile createTile();// Métod abstracto que debe ser implementado por las subclases para definir qué tipo de Tile se crea

    public void display(){ // Métod para mostrar el mapa en la consola

        for(int i=0;i<tiles.length;i++){
            for(int j=0;j<tiles[i].length;j++){
                System.out.print(tiles[i][j].getType()+ " ");
            }
            System.out.println();// Salta a la siguiente línea después de imprimir una fila completa


        }
        System.out.println();

        for(int i=0;i<tiles.length;i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();// Salta a la siguiente línea después de imprimir una fila completa

        }
    }
}
