package Tehtava6;

public class EncryptedPrinter extends PrinterDecorator {

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }
//se crea la encriptacion
    private String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char)(c + 3)); // Desplazamiento de 3
        }
        return encrypted.toString();
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        wrappedPrinter.print(encryptedMessage);
    }
}

