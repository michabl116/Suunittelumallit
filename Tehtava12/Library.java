package Tehtava12;
import java.util.*;

public class Library {
    public Map<String, DocumentInt> docs = new HashMap<>();

    public void add(String id, DocumentInt doc) {
        docs.put(id, doc);
    }

    public DocumentInt get(String id) {
        return docs.get(id);
    }

}

