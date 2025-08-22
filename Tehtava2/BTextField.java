package Tehtava2;

public class BTextField extends TextField{
    public BTextField(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("<< " + text + " >>");



    }
}
