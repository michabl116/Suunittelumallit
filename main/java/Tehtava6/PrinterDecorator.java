package Tehtava6;
//clase abstracta que implementa de printer
//decorador
public abstract class PrinterDecorator implements Printer {
    protected  Printer wrappedPrinter;
    public PrinterDecorator(Printer printer){
        this.wrappedPrinter = printer;
    }
}
