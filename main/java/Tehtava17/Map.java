package main.java.Tehtava17;

public abstract class Map {
    Tile[][] tiles;

    public Map(int rows, int cols) {
        tiles = new Tile[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tiles[i][j] = createTile(j, i); // j = x, i = y
            }
        }
    }

    public abstract Tile createTile(int x, int y);

    public Tile[][] getTiles() {
        return tiles;
    }
}

