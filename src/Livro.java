public class Livro {
    private static int nextId = 1;
    private int id;
    private String name;
    private String author;

    Livro(String name, String author) {
        this.id = nextId;
        this.name = name;
        this.author = author;
        nextId++;
    }

    int getId() {return this.id;}
    String getName() {return this.name;}
    String getAuthor() {return this.author;}
}