package Tehtava2.Factory;

import Tehtava2.button.Button;
import Tehtava2.checkbox.Checkbox;
import Tehtava2.textfield.TextField;

public abstract class UIFactory {
    public abstract Button createButton(String text);
    public abstract TextField createTextfield(String text);
    public abstract Checkbox createCheckbox(String text);

}
