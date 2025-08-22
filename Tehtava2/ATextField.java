package Tehtava2;

public class ATextField extends TextField {
    public ATextField(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[ " + text + " ]");


    }

}
