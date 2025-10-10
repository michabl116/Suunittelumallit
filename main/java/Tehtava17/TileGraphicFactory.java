package main.java.Tehtava17;



import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, TileType> cache = new HashMap<>();

    public static TileType getTileType(String name, String imagePath) {
        if (!cache.containsKey(name)) {
            Image img = new Image(imagePath);
            cache.put(name, new TileType(name, img));
        }
        return cache.get(name);
    }
}

