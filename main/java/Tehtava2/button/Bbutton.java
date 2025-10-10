package Tehtava2.button;

public class Bbutton extends Button {
//clase concreta que hereda de la clase button
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
