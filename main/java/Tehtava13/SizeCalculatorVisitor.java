package Tehtava13;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private double totalSize = 0;

    public  void  visit( File file ) {
        totalSize += file.getSizeMB();
    }

    @Override
    public void visit(Directory directory) {

    }
    public double  getTotalSize() {
        return totalSize;
    }
}
