package Tehtava17;

import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, TileGraphic> cache = new HashMap<>();

    public static TileGraphic getTileGraphic(String type) {
        if (!cache.containsKey(type)) {
            Image image = loadImageForType(type);
            char character = getCharacterForType(type);
            cache.put(type, new TileGraphic(type, character, image));
        }
        return cache.get(type);
    }

    private static Image loadImageForType(String type) {
        return new Image(TileGraphicFactory.class.getResource("/" + type + ".png").toExternalForm());

    }

    private static char getCharacterForType(String type) {
        return switch (type) {
            case "grass" -> '.';
            case "water" -> '~';
            case "mountain" -> '^';
            case "road" -> '#';
            default -> '?';
        };
    }
}
