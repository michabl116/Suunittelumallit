package Tehtava1;
// esta clase hereda de tile se llama edificios
public class BuildingTile extends Tile {
    @Override
    public String getType() {
        return "Building";
    }

    @Override
    public char getCharacter() {
        return 'B';
    }
}
