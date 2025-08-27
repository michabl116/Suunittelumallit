package Tehtava2;

import Tehtava2.Factory.AFactory;
import Tehtava2.Factory.UIFactory;
import Tehtava2.button.Button;
import Tehtava2.checkbox.Checkbox;
import Tehtava2.textfield.TextField;

public class Main {
    public static void main(String[] args) {

        UIFactory factory = new AFactory();

        Button button = factory.createButton("Enter");
        TextField textField = factory.createTextfield("Username");
        Checkbox checkbox = factory.createCheckbox("F");
        System.out.println("\n---AFactory---\n");
        button.display();
        textField.display();
        checkbox.display();


        button.setText("Hyväksyä");
        textField.setText("Maksuehdot");
        checkbox.setText("Hyväksyn ehdot");

        System.out.println("\n---------\n");

        button.display();
        textField.display();
        checkbox.display();
    }
}
