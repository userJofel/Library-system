public class Livro {
    private static int nextId = 1;
    private int id;
    private String name;
    private String author;
    private boolean available;

    Livro(String name, String author) {
        this.id = nextId;
        this.name = name;
        this.author = author;
        this.available = true;
        nextId++;
    }

    public int getId() {return this.id;}

    public String getName() {return this.name;}
    public String getAuthor() {return this.author;}
    public boolean getAvaliable() {return this.available;}

    public void setName(String name) {this.name = name;}
    public void setAuthor(String email) {this.author = email;}
    public void setAvailable(boolean available) {this.available = available;}
}