package Tehtava1;
// esta clase  hereda de la clase tile
public class WaterTile extends Tile {

    @Override
    public String getType() {
        return "Water";
    }

    @Override
    public char getCharacter() {
        return 'W';
    }
}
