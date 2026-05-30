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

    int getId() {return this.id;}
    String getName() {return this.name;}
    String getEmail() {return this.email;}
}