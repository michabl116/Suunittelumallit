package Tehtava18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Recommendation> recommendations = new ArrayList<>();

        // Example: initial recommendation
        Recommendation youthRec = new Recommendation("Young Readers");
        youthRec.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy", 1997));
        youthRec.addBook(new Book("Percy Jackson", "Rick Riordan", "Adventure", 2005));
        recommendations.add(youthRec);

        while (true) {
            System.out.println("\n--- Book Recommendation System ---");
            System.out.println("1. View recommendations");
            System.out.println("2. Clone a recommendation");
            System.out.println("3. Edit a recommendation");
            System.out.println("4. Create a new recommendation");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println("\n[" + i + "]");
                        recommendations.get(i).printRecommendation();
                    }
                }
                case 2 -> {
                    System.out.print("Enter index of recommendation to clone: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index >= 0 && index < recommendations.size()) {
                        Recommendation clone = recommendations.get(index).clone();
                        System.out.print("Enter new target audience: ");
                        clone.setTargetAudience(scanner.nextLine());
                        recommendations.add(clone);
                        System.out.println("Cloning successful.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter index of recommendation to edit: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index >= 0 && index < recommendations.size()) {
                        Recommendation rec = recommendations.get(index);
                        rec.printRecommendation();
                        System.out.println("1. Add a book");
                        System.out.println("2. Remove a book");
                        System.out.println("3. Change target audience");
                        int edit = Integer.parseInt(scanner.nextLine());
                        switch (edit) {
                            case 1 -> {
                                System.out.print("Book title: ");
                                String title = scanner.nextLine();
                                System.out.print("Author: ");
                                String author = scanner.nextLine();
                                System.out.print("Genre: ");
                                String genre = scanner.nextLine();
                                System.out.print("Publication year: ");
                                int year = Integer.parseInt(scanner.nextLine());
                                rec.addBook(new Book(title, author, genre, year));
                            }
                            case 2 -> {
                                System.out.print("Enter index of book to remove: ");
                                int bookIndex = Integer.parseInt(scanner.nextLine());
                                rec.removeBook(bookIndex);
                            }
                            case 3 -> {
                                System.out.print("New target audience: ");
                                rec.setTargetAudience(scanner.nextLine());
                            }
                        }
                    }
                }
                case 4 -> {
                    System.out.print("Enter target audience: ");
                    String audience = scanner.nextLine();
                    Recommendation newRec = new Recommendation(audience);
                    recommendations.add(newRec);
                    System.out.println("New recommendation created.");
                }
                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }
            }
        }
    }
}

