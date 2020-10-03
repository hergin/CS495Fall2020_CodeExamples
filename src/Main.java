public class Main {

    public static void main(String[] args) {
        Writer John = new Writer("Jones", 35);
        Document Draft = new Document("legal_proc", 54);
        John.addDocument(Draft);
        Document master = new Document("master", 32);
        John.addDocument(master);
    }

}

