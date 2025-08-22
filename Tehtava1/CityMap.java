package Tehtava1;


public class CityMap extends Map {
    public CityMap(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    public Tile createTile() {
        int r = (int)(Math.random() * 3);
        switch (r) {
            case 0: return new RoadTile();
            case 1: return new ForestTile();
            default: return new BuildingTile();
        }
    }
}
