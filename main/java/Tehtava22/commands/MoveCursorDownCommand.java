package Tehtava22.commands;


import Tehtava22.Command;
import Tehtava22.PixelArtEditor;

public class MoveCursorDownCommand implements Command {
    private PixelArtEditor editor;

    public MoveCursorDownCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.moveCursor(1, 0);
    }
}

