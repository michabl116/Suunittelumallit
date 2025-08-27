package Tehtava2.checkbox;

public class BCheckbox extends Checkbox {
    public BCheckbox(String text) {

        super(text);
    }

    @Override
    public void display() {
        System.out.println("[x] " + text);

    }
}
