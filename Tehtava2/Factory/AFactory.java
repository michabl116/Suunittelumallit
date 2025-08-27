package Tehtava2.Factory;

import Tehtava2.button.AButton;
import Tehtava2.checkbox.ACheckbox;
import Tehtava2.checkbox.Checkbox;
import Tehtava2.textfield.ATextField;
import Tehtava2.button.Button;
import Tehtava2.textfield.TextField;

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
