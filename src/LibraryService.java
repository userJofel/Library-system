import java.util.ArrayList;

public class LibraryService {
    private ArrayList<Usuario> Usuarios = new ArrayList<>();
    private ArrayList<Livro> Livros = new ArrayList<>();
    private ArrayList<Loan> Emprestimos = new ArrayList<>();

    // Creates

    public void createUser(String name, String email) {
        Usuario User = new Usuario(name, email);
        Usuarios.add(User);
        System.out.println("Usuário criado com sucesso!");
    }

    public void createLivro(String name, String author) {
        Livro livro = new Livro(name, author);
        Livros.add(livro);
        System.out.println("Livro criado com sucesso!");
    }

    public void emprestarLivro(int userId, int bookId) {
        for (Livro book : Livros) {
            if (book.getId() == bookId) {

                if (!book.getAvaliable()) {
                    System.out.println("Livro indisponível!");
                    return;
                }

                for (Usuario user : Usuarios) {
                    if (user.getId() == userId) {
                        Loan emprestimo = new Loan(user, book);
                        book.setAvailable(false);
                        Emprestimos.add(emprestimo);

                        System.out.println("Empréstimo realizado com sucesso!");
                        return;
                    }
                }

                System.out.println("Usuário não encontrado!");
                return;
            }
        }

        System.out.println("Livro não encontrado!");
    }

    // Devolver

    public void devolverLivro(int userId, int bookId) {
        for (Loan emprestimo : Emprestimos) {
            if (emprestimo.getUser().getId() == userId && emprestimo.getBook().getId() == bookId) {
                emprestimo.getBook().setAvailable(true);
                Emprestimos.remove(emprestimo);
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }

        System.out.println("Empréstimo não encontrado!");
    }

    // Listas

    public void listaLivros() {
        System.out.println("||----- Lista de Livros -----||");

        if (Livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (Livro book : Livros) {
            System.out.println(book.getId() + "# | Nome: " + book.getName() + " | Autor: " + book.getAuthor() + " | Status: " + (book.getAvaliable() ? "Disponível" : "Indisponível"));
        }
    }

    public void listaUsuarios() {
        System.out.println("||----- Lista de Usuários -----||");

        if (Usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        for (Usuario user : Usuarios) {
            System.out.println(user.getId() + "# | Nome: " + user.getName() + " | E-mail: " + user.getEmail());
        }
    }

    public void listaEmprestimos() {
        System.out.println("||----- Lista de Empréstimos -----||");

        if (Emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo ativo.");
            return;
        }

        for (Loan loan : Emprestimos) {
            System.out.println("Livro: " + loan.getBook().getName() + " | Usuário: " + loan.getUser().getName());
        }
    }

    // Busca

    public void buscarUser(int id) {
        for (Usuario user : Usuarios) {
            if (user.getId() == id) {
                System.out.println(user.getId() + "# | Nome: " + user.getName() + " | E-mail: " + user.getEmail());
                return;
            }
        }

        System.out.println("Usuário não encontrado!");
    }

    public void buscarLivro(int id) {
        for (Livro book : Livros) {
            if (book.getId() == id) {
                System.out.println(book.getId() + "# | Nome: " + book.getName() + " | Autor: " + book.getAuthor() + " | Status: " + (book.getAvaliable() ? "Disponível" : "Indisponível"));
                return;
            }
        }

        System.out.println("Livro não encontrado!");
    }
}