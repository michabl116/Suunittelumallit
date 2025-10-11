package Tehtava22.commands;


import Tehtava22.Command;
import Tehtava22.PixelArtEditor;

public class MoveCursorUpCommand implements Command {
    private PixelArtEditor editor;

    public MoveCursorUpCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.moveCursor(-1, 0);
    }
}

