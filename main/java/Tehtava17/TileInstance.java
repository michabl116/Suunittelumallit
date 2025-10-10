package Tehtava17;



import javafx.scene.canvas.GraphicsContext;

public class TileInstance {
    private final int x;
    private final int y;
    private final TileGraphic graphic;

    public TileInstance(int x, int y, TileGraphic graphic) {
        this.x = x;
        this.y = y;
        this.graphic = graphic;
    }

    public void render(GraphicsContext gc, int tileSize) {
        gc.drawImage(graphic.getImage(), x * tileSize, y * tileSize, tileSize, tileSize);
    }

    public String getType() {
        return graphic.getType();
    }

    public char getCharacter() {
        return graphic.getCharacter();
    }
}
