package Tehtava2;

public class Bbutton extends Button {

    public Bbutton(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("************");
        System.out.println("* " + text + " *");
        System.out.println("************");

    }
}
