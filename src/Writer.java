import java.util.ArrayList;
import java.util.List;

public class Writer {
    private String name;
    private Integer age;
    private List<Document> documents;

    public Writer(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document aDocument) {
        this.documents.add(aDocument);
    }
}

