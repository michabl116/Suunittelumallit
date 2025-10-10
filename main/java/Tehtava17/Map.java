package Tehtava17;

import javafx.scene.canvas.GraphicsContext;

public abstract class Map {
    TileInstance[][] tiles;

    public Map(int rows, int cols) {
        tiles = new TileInstance[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String type = getRandomTileType();
                TileGraphic graphic = TileGraphicFactory.getTileGraphic(type);
                tiles[i][j] = new TileInstance(j, i, graphic);
            }
        }
    }

    protected abstract String getRandomTileType();

    public void display() {
        for (TileInstance[] row : tiles) {
            for (TileInstance tile : row) {
                System.out.print(tile.getType() + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (TileInstance[] row : tiles) {
            for (TileInstance tile : row) {
                System.out.print(tile.getCharacter() + " ");
            }
            System.out.println();
        }
    }

    public void render(GraphicsContext gc, int tileSize) {
        for (TileInstance[] row : tiles) {
            for (TileInstance tile : row) {
                tile.render(gc, tileSize);
            }
        }
    }
}
