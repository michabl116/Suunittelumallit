package Tehtava2;

public abstract class UIFactory {
    public abstract  Button createButton( String text);
    public abstract  TextField createTextfield(String text);
    public abstract  Checkbox createCheckbox(String text);

}
