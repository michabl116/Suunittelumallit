package Tehtava6;

//decorador
public class XMLPrinter extends PrinterDecorator {

    public XMLPrinter(Printer printer) {
        super(printer);
    }

    private String toXML(String message) {
        return "<message>" + message + "</message>";
    }

    @Override
    public void print(String message) {
        String xmlMessage = toXML(message);
        wrappedPrinter.print(xmlMessage);
    }
}

