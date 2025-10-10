package Tehtava2.textfield;

public class ATextField extends TextField {
    public ATextField(String text) {

        super(text);
    }

    @Override
    public void display() {
        System.out.println("[ " + text + " ]");


    }

}
