package Tehtava1;
//esta calse ereda de tille se llama camino
public class RoadTile extends Tile {

    @Override
    public String getType() {
        return "Road";
    }

    @Override
    public char getCharacter() {
        return 'R';
    }
}
