package Tehtava17;



import java.util.Random;

public class WildernessMap extends Map {
    private final Random rand = new Random();

    public WildernessMap(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    protected String getRandomTileType() {
        int r = rand.nextInt(3);
        return switch (r) {
            case 0 -> "grass";
            case 1 -> "water";
            case 2 -> "mountain";
            default -> "grass";
        };
    }
}
