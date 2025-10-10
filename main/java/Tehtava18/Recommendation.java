package Tehtava18;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        }
    }

    public void setTargetAudience(String audience) {
        this.targetAudience = audience;
    }

    public Recommendation clone() {
        Recommendation copy = new Recommendation(targetAudience);
        for (Book book : books) {
            copy.addBook(book.clone()); // deep copy
        }
        return copy;
    }

    public void printRecommendation() {
        System.out.println("Recommendation for: " + targetAudience);
        for (int i = 0; i < books.size(); i++) {
            System.out.println("  [" + i + "] " + books.get(i));
        }
    }
}
