package Tehtava22.commands;


import Tehtava22.Command;
import Tehtava22.PixelArtEditor;

public class TogglePixelCommand implements Command {
    private  PixelArtEditor editor;

    public TogglePixelCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.togglePixel();
    }
}