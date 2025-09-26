package Tehtava12;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        AccessControlService access = AccessControlService.getInstance();

        User alice = new User("alice");
        User bob = new User("bob");

        Document publicDoc = new Document("doc1", "2025-09-26", "Public info");
        Document secretDoc = new Document("doc2", "2025-09-26", "Top secret");

        DocumentInt proxy1 = new DocumentProxy(publicDoc, false);
        DocumentInt proxy2 = new DocumentProxy(secretDoc, true);

        lib.add("doc1", proxy1);
        lib.add("doc2", proxy2);

        access.allow("doc2", "alice");

        System.out.println("Alice reads doc1: " + lib.get("doc1").getContent(alice));
        System.out.println("Bob reads doc1: " + lib.get("doc1").getContent(bob));
        System.out.println("Alice reads doc2: " + lib.get("doc2").getContent(alice));
        System.out.println("Bob reads doc2: " + lib.get("doc2").getContent(bob));
    }
}