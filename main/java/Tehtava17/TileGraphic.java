package Tehtava17;



import javafx.scene.image.Image;

public class TileGraphic {
    private final String type;
    private final char character;
    private final Image image;

    public TileGraphic(String type, char character, Image image) {
        this.type = type;
        this.character = character;
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public char getCharacter() {
        return character;
    }

    public Image getImage() {
        return image;
    }
}

