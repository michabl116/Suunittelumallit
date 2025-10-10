package Tehtava12;


public class Document implements DocumentInt {
    private String id;
    private String creationDate;
    private String content;

    public Document(String id, String creationDate, String content) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public String getCreationDate() {
        return creationDate;

    }
}
