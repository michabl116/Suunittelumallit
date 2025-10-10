package main.java.Tehtava17;



import java.util.Random;

public class CityMap extends Map {
    private final String[] types = {"road", "forest", "building"};

    public CityMap(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    public Tile createTile(int x, int y) {
        String type = types[new Random().nextInt(types.length)];
        String imagePath = "/images/" + type + ".png"; // Asegúrate de tener estas imágenes en tu carpeta resources
        TileType tileType = TileGraphicFactory.getTileType(type, imagePath);
        return new Tile(tileType, x, y);
    }
}
