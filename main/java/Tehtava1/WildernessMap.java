package Tehtava1;
//esta clase hereda de la clece map y deside como creara  tile  Se llama desierto
public class WildernessMap extends Map {
    public WildernessMap(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    public Tile createTile() {
        int r = (int)(Math.random() * 3);
        switch (r) {
            case 0: return new SwampTile();
            case 1: return new ForestTile();
            default: return new WaterTile();
        }
    }
}

