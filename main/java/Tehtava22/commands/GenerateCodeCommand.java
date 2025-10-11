package Tehtava22.commands;

import Tehtava22.Command;
import Tehtava22.PixelArtEditor;

public class GenerateCodeCommand implements Command {
    private  PixelArtEditor editor;

    public GenerateCodeCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        int[][] grid = editor.getGrid();
        System.out.println("int[][] pixelArt = {");
        for (int y = 0; y < grid.length; y++) {
            System.out.print("    {");
            for (int x = 0; x < grid[y].length; x++) {
                System.out.print(grid[y][x]);
                if (x < grid[y].length - 1) System.out.print(", ");
            }
            System.out.println("},");
        }
        System.out.println("};");
    }
}
