package Tehtava2;

public class AButton extends Button {
    public AButton(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("+-------+");
        System.out.println("|" +text+"|");
        System.out.println("+-------+");

    }
}
