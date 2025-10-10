package Tehtava1;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Crea un objeto Scanner para leer la entrada del usuario


        System.out.println("where you want to play city( C ) / Wilderness ( W ) : ");
        String type = sc.nextLine();
        Map map = createMap(type, 5, 5); //Llama al méto createMap para crear un mapa según el tipo elegido, con 5 filas y 5 columnas


        map.display();// Muestra el mapa en la consola




    }

    // Métod que crea y devuelve un objeto Map según el tipo
    public  static Map createMap(String type, int rows, int cols){
        if(type.equals("W")){
            return new WildernessMap(rows,cols);

        }else {
            return new CityMap(rows,cols);

        }
    }

}
