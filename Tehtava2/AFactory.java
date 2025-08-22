package Tehtava2;

public class AFactory extends UIFactory {

    public Button createButton(String text) {
        return new AButton(text);
    }
    public TextField createTextfield(String text) {
        return new ATextField(text);
    }
    public Checkbox createCheckbox(String text) {
        return new ACheckbox(text);
    }
}
