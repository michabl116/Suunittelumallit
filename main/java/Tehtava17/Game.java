package Tehtava17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;
import java.util.Optional;

public class Game extends Application {

    @Override
    public void start(Stage primaryStage) {
        ChoiceDialog<String> dialog = new ChoiceDialog<>("C", List.of("C", "W"));
        dialog.setTitle("Map Selection");
        dialog.setHeaderText("Choose your map type");
        dialog.setContentText("City (C) or Wilderness (W):");

        Optional<String> result = dialog.showAndWait();
        if (result.isEmpty()) {
            System.out.println("No map selected. Exiting.");
            return;
        }

        String type = result.get();
        int rows = 10;
        int cols = 10;
        int tileSize = 32;

        Map map = createMap(type, rows, cols);

        Canvas canvas = new Canvas(cols * tileSize, rows * tileSize);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        map.render(gc, tileSize);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root);

        primaryStage.setTitle("RPG Map Viewer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static Map createMap(String type, int rows, int cols) {
        return type.equals("W") ? new WildernessMap(rows, cols) : new CityMap(rows, cols);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
