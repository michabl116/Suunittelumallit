package Tehtava1;

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
