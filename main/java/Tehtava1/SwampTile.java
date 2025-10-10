package Tehtava1;
//esta clase hereda de tile  es pantano
public class SwampTile extends Tile {

    @Override
    public String getType() {
        return "Swamp";
    }

    @Override
    public char getCharacter() {
        return 'S';
    }
}
