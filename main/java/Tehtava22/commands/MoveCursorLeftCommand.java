package Tehtava22.commands;



import Tehtava22.PixelArtEditor;
import Tehtava22.Command;

public class MoveCursorLeftCommand implements Command {
    private  PixelArtEditor editor;

    public MoveCursorLeftCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.moveCursor(0, -1);
    }
}

