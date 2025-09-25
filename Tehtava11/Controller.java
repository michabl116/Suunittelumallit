package Tehtava11;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history;
    private List<IMemento> redoHistory;
    private List<StateMetadata> fullHistory = new ArrayList<>();


    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {

        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {

        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()){
            IMemento currentState = model.createMemento();
            redoHistory.add(currentState);

            System.out.println("Memento found in history");
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
        redoHistory.clear();
        StateMetadata metadata = new StateMetadata(currentState);
        fullHistory.add(metadata);








    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            IMemento currentState = model.createMemento();
            history.add(currentState);// Guarda el estado actual antes de rehacer
            //System.out.println("Memento found in history"+ currentState);
            IMemento redoState = redoHistory.remove(redoHistory.size() - 1);
            model.restoreState(redoState);
            gui.updateGui();
        }

    }
    public List<StateMetadata> getFullHistory() {
        return fullHistory;
    }

    public void restoreFromMetadata(StateMetadata metadata) {
        model.restoreState(metadata.getMemento());
        gui.updateGui();
    }
    public void saveInitialState() {
        IMemento initialState = model.createMemento();
        fullHistory.add(new StateMetadata(initialState));
    }

}
