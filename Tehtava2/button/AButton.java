package Tehtava2.button;

public class AButton extends Button {

    //clase que  hereda de la clase button
    public AButton(String text) {

        super(text);
    }

    @Override
    public void display() {
        System.out.println("+========+");
        System.out.println("|" +text+"|");
        System.out.println("+========+");

    }
}
