package Tehtava12;

import java.nio.file.AccessDeniedException;

public interface IDocument {

    String getContent(User user) throws AccessDeniedException;
    String getCreationDate();
}
