package main.java.Tehtava17;



import javafx.scene.image.Image;

public class TileType {
    private final String name;
    private final Image image;

    public TileType(String name, Image image) {
        this.name = name;
        this.image = image;
    }

    public String getName() { return name; }
    public Image getImage() { return image; }
}
