package Tehtava22;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import Tehtava22.commands.*;

public class PixelArtEditor extends Application {
    private  int SIZE = 8;
    private  int[][] grid = new int[SIZE][SIZE];
    private int cursorX = 0, cursorY = 0;
    private  GridPane gridPane = new GridPane();

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) {
        drawGrid();

        Button generateButton = new Button("Crear código");
        generateButton.setOnAction(e -> new GenerateCodeCommand(this).execute());

        VBox root = new VBox(gridPane, generateButton);
        Scene scene = new Scene(root);
        scene.setOnKeyPressed(e -> {
            Command cmd = switch (e.getCode()) {
                case UP -> new MoveCursorUpCommand(this);
                case DOWN -> new MoveCursorDownCommand(this);
                case LEFT -> new MoveCursorLeftCommand(this);
                case RIGHT -> new MoveCursorRightCommand(this);
                case SPACE -> new TogglePixelCommand(this);
                default -> null;
            };
            if (cmd != null) {
                cmd.execute();
                drawGrid();
            }
        });

        stage.setScene(scene);
        stage.setTitle("Editor de Pixel Art");
        stage.show();
        scene.getRoot().requestFocus();

    }

    public void moveCursor(int dy, int dx) {
        cursorY = Math.max(0, Math.min(SIZE - 1, cursorY + dy));
        cursorX = Math.max(0, Math.min(SIZE - 1, cursorX + dx));
    }

    public void togglePixel() {
        grid[cursorY][cursorX] ^= 1;
    }

    public int[][] getGrid() {
        return grid;
    }

    private void drawGrid() {
        gridPane.getChildren().clear();
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                Rectangle r = new Rectangle(40, 40);
                r.setFill(grid[y][x] == 1 ? Color.BLACK : Color.WHITE);
                if (x == cursorX && y == cursorY) {
                    r.setStroke(Color.RED);
                    r.setStrokeWidth(2);
                } else {
                    r.setStroke(Color.GRAY);
                }
                gridPane.add(r, x, y);
            }
        }
    }
}
