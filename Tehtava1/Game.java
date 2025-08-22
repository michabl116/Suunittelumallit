package Tehtava1;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("where you want to play city or Wilderness");
        String type = sc.nextLine();
        Map map = createMap(type, 5, 5);
        map.display();


    }

    public  static Map createMap(String type, int rows, int cols){
        if(type.equals("Wilderness")){
            return new WildernessMap(rows,cols);

        }else {
            return new CityMap(rows,cols);

        }
    }

}
