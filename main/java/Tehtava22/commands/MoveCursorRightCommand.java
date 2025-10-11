package Tehtava22.commands;

import Tehtava22.Command;
import Tehtava22.PixelArtEditor;

public class MoveCursorRightCommand implements Command {
    private  PixelArtEditor editor;

    public MoveCursorRightCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.moveCursor(0, 1);
    }
}

