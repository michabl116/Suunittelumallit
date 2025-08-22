package Tehtava2;

public class Main {
    public static void main(String[] args) {
        // Cambia entre AFactory y BFactory para probar estilos
        UIFactory factory = new AFactory();

        Button button = factory.createButton("Aceptar");
        TextField textField = factory.createTextfield("Usuario");
        Checkbox checkbox = factory.createCheckbox("Recordarme");

        button.display();
        textField.display();
        checkbox.display();

        // Cambiar texto dinámicamente
        button.setText("Enviar");
        textField.setText("Nombre");
        checkbox.setText("Acepto términos");

        System.out.println("\n--- Después de cambiar el texto ---\n");

        button.display();
        textField.display();
        checkbox.display();
    }
}
