package Tehtava13;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String extension;
    private List<File> matchedFiles = new ArrayList<>();

    public SearchVisitor(String extension) {
        this.extension = extension;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(extension)) {
            matchedFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
    }

    public List<File> getMatchedFiles() {
        return matchedFiles;
    }
}