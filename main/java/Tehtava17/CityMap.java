package Tehtava17;

import java.util.Random;

public class CityMap extends Map {
    private final Random rand = new Random();

    public CityMap(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    protected String getRandomTileType() {
        return rand.nextInt(2) == 0 ? "road" : "grass";
    }
}
