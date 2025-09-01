package test;

public class Logger {
    private static Logger instancia;

    private Logger() {
        // Constructor privado
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String mensaje) {
        System.out.println("Log: " + mensaje);
    }
}

// Uso del Singleton
 class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstancia();
        logger.log("Hola desde el Singleton!");
    }
}
