package Tehtava2.textfield;

public class BTextField extends TextField {
    public BTextField(String text) {

        super(text);
    }

    @Override
    public void display() {
        System.out.println("<< " + text + " >>");



    }
}
