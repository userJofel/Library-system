public class Loan {
    private Usuario user;
    private Livro book;

    Loan(Usuario user, Livro book) {
        this.user = user;
        this.book = book;
    }

    public Usuario getUser() {return this.user;}
    public Livro getBook() {return book;}
}
