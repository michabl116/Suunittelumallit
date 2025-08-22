package Tehtava2;

public class BFactory extends UIFactory {
    public Button createButton(String text) {
        return new Bbutton(text);
    }
    public TextField createTextfield(String text) {
        return new BTextField(text);
    }
    public Checkbox createCheckbox(String text) {
        return new BCheckbox(text);
    }


}
