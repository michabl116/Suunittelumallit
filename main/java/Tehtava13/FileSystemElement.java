package Tehtava13;

import org.junit.platform.engine.TestDescriptor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor); // ← esto es lo correcto
}
