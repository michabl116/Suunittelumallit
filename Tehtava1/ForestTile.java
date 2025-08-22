package Tehtava1;
//esta clase hereda de tile
public class ForestTile extends  Tile{
    @Override
    public String getType() {
        return "Forest";
    }
    @Override
    public char getCharacter() {
        return 'F';
    }

}
