package Tehtava13;

public class Main {
    public static void main(String[] args) {
        // Crear estructura de directorios
        Directory root = new Directory("root");
        Directory docs = new Directory("docs");
        Directory images = new Directory("images");

        root.addElement(new File("readme.txt", 1.2));
        root.addElement(docs);
        root.addElement(images);

        docs.addElement(new File("manual.pdf", 2.5));
        docs.addElement(new File("notes.txt", 0.8));

        images.addElement(new File("photo.jpg", 3.0));
        images.addElement(new File("logo.png", 1.5));

        // Aplicar visitante de tamaño
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " MB");

        // Aplicar visitante de búsqueda
        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);
        System.out.println(".txt files found:");
        for (File f : searchVisitor.getMatchedFiles()) {
            System.out.println("- " + f.getName() + " (" + f.getSizeMB() + " MB)");
        }
    }
}
