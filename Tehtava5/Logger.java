package Tehtava5;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;
    private String fileName ="default_log.txt";

    // contructor privado
    // Private constructor to prevent instantiation
    private  Logger() {
        openfile();
    }
    // verifica  si la istancia es nulla .Si lo es crea la inatancia si no hay
    // Public method to get the single instance
    public static Logger getInstance() {
        if(instance == null) {
            synchronized (Logger.class) {
                if(instance == null) {
                    instance = new Logger();
                }
            }

        }
        return instance;
    }
    //canbia el nombre del archibo de log llama a close para serrar y abre uno nuevo
    public void setFileName(String newName) {
        fileName = newName;
        close();
        openfile();
    }
    //intenta abrir el archivo usando FileWriter en modo de añadir (true).
    public void openfile() {
        try {
            FileWriter fw =new FileWriter(fileName, true);
            writer = new PrintWriter(fw, true);

        }catch (IOException e){
            System.out.println("Failed to open file" + e.getMessage());
        }
    }
    //Verifica si el escritor (writer) está inicializado.
    //Si lo está, escribe el mensaje en el archivo.
    public void write(String mensaje) {
        if (writer != null) {
            try {
                writer.println(mensaje);
            } catch (Exception e) {
                System.out.println("failed to write message: " + mensaje);
            }
        } else {
            System.out.println("unable to write" + mensaje + "(writer no initialized");
        }
    }
    //sierra el escritorio(write)
    public void close() {
        if (writer != null) {
            try {
                writer.close();
            }catch (Exception e) {
                System.out.println("failed to close file");

            }
            writer = null;
        }
    }
}




