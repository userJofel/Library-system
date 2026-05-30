public class Usuario {
    private static int nextId = 1;
    private int id;
    private String name;
    private String email;

    Usuario(String name, String email) {
        this.id = nextId;
        this.name = name;
        this.email = email;
        nextId++;
    }

    public int getId() {return this.id;}
    public String getName() {return this.name;}
    public String getEmail() {return this.email;}
    public void setName(String name) {this.name = name; }
    public void setEmail(String email) {this.email = email;}
}