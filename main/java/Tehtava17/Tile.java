package main.java.Tehtava17;


import javafx.scene.image.Image;

public class Tile {
    private final TileType type; // Estado intrínseco (compartido)
    private final int x, y;      // Estado extrínseco (único por tile)

    public Tile(TileType type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public String getType() {
        return type.getName();
    }

    public char getCharacter() {
        return switch (type.getName()) {
            case "swamp" -> 'S';
            case "water" -> 'W';
            case "road" -> 'R';
            case "forest" -> 'F';
            case "building" -> 'B';
            default -> '?';
        };
    }

    public Image getImage() {
        return type.getImage();
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
