package Tehtava2.Factory;

import Tehtava2.checkbox.BCheckbox;
import Tehtava2.checkbox.Checkbox;
import Tehtava2.textfield.BTextField;
import Tehtava2.button.Bbutton;
import Tehtava2.button.Button;
import Tehtava2.textfield.TextField;

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
