import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        byte acao;
        LibraryService service = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("""
                    ||----- Biblioteca -----||
                    Ações:
                     1 - Criar usuário
                     2 - Criar livro
                     3 - Buscar usuário
                     4 - Buscar livro
                     5 - Realizar empréstimo
                     6 - Devolver livro
                     7 - Lista de usuários
                     8 - Lista de livros
                     9 - Lista de empréstimos
                     0 - Sair
                    """);

            System.out.print("Escolha uma opção: ");
            acao = scanner.nextByte();
            scanner.nextLine(); // limpa o Enter

            switch (acao) {
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    String userName = scanner.nextLine();

                    System.out.print("Digite o email do usuário: ");
                    String userEmail = scanner.nextLine();

                    service.createUser(userName, userEmail);
                    break;

                case 2:
                    System.out.print("Digite o nome do livro: ");
                    String bookName = scanner.nextLine();

                    System.out.print("Digite o autor do livro: ");
                    String bookAuthor = scanner.nextLine();

                    service.createLivro(bookName, bookAuthor);
                    break;

                case 3:
                    System.out.print("Digite o ID do usuário: ");
                    int userId = scanner.nextInt();

                    service.buscarUser(userId);
                    break;

                case 4:
                    System.out.print("Digite o ID do livro: ");
                    int bookId = scanner.nextInt();

                    service.buscarLivro(bookId);
                    break;

                case 5:
                    System.out.print("Digite o ID do usuário: ");
                    int user_id = scanner.nextInt();

                    System.out.print("Digite o ID do livro: ");
                    int book_id = scanner.nextInt();

                    service.emprestarLivro(user_id, book_id);
                    break;

                case 6:
                    System.out.print("Digite o ID do usuário: ");
                    int devolucaoUserId = scanner.nextInt();

                    System.out.print("Digite o ID do livro: ");
                    int devolucaoBookId = scanner.nextInt();

                    service.devolverLivro(devolucaoUserId, devolucaoBookId);
                    break;

                case 7:
                    service.listaUsuarios();
                    break;

                case 8:
                    service.listaLivros();
                    break;

                case 9:
                    service.listaEmprestimos();
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (acao != 0);

        System.out.println("||----- INICIANDO TESTE MASSIVO -----||");

        System.out.println("\n--- Criando usuários ---");
        service.createUser("João Silva", "joao@email.com");
        service.createUser("Maria Souza", "maria@email.com");
        service.createUser("Carlos Lima", "carlos@email.com");
        service.createUser("Ana Santos", "ana@email.com");
        service.createUser("Pedro Oliveira", "pedro@email.com");

        System.out.println("\n--- Criando livros ---");
        service.createLivro("Dom Casmurro", "Machado de Assis");
        service.createLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        service.createLivro("1984", "George Orwell");
        service.createLivro("A Revolução dos Bichos", "George Orwell");
        service.createLivro("Harry Potter", "J.K. Rowling");

        System.out.println("\n--- Listando usuários ---");
        service.listaUsuarios();

        System.out.println("\n--- Listando livros ---");
        service.listaLivros();

        System.out.println("\n--- Buscando usuários existentes ---");
        service.buscarUser(1);
        service.buscarUser(3);
        service.buscarUser(5);

        System.out.println("\n--- Buscando usuário inexistente ---");
        service.buscarUser(99);

        System.out.println("\n--- Buscando livros existentes ---");
        service.buscarLivro(1);
        service.buscarLivro(3);
        service.buscarLivro(5);

        System.out.println("\n--- Buscando livro inexistente ---");
        service.buscarLivro(99);

        System.out.println("\n--- Realizando empréstimos ---");
        service.emprestarLivro(1, 1);
        service.emprestarLivro(2, 2);
        service.emprestarLivro(3, 3);
        service.emprestarLivro(4, 4);
        service.emprestarLivro(5, 5);

        System.out.println("\n--- Listando empréstimos depois dos empréstimos ---");
        service. listaEmprestimos();

        System.out.println("\n--- Listando livros depois dos empréstimos ---");
        service.listaLivros();

        System.out.println("\n--- Tentando emprestar livro já emprestado ---");
        service.emprestarLivro(2, 1);

        System.out.println("\n--- Tentando emprestar para usuário inexistente ---");
        service.emprestarLivro(99, 1);

        System.out.println("\n--- Tentando emprestar livro inexistente ---");
        service.emprestarLivro(1, 99);

        System.out.println("\n--- Devolvendo livro corretamente ---");
        service.devolverLivro(1, 1);

        System.out.println("\n--- Listando livros depois da devolução ---");
        service.listaLivros();

        System.out.println("\n--- Listando empréstimos depois da devolução ---");
        service.listaEmprestimos();

        System.out.println("\n--- Emprestando livro devolvido para outro usuário ---");
        service.emprestarLivro(2, 1);

        System.out.println("\n--- Listando empréstimos após novo empréstimo ---");
        service.listaEmprestimos();

        System.out.println("\n--- Devolvendo livro do usuário 2 ---");
        service.devolverLivro(2, 1);

        System.out.println("\n--- Tentando devolver o mesmo livro duas vezes ---");
        service.devolverLivro(2, 1);

        System.out.println("\n--- Tentando devolver empréstimo inexistente ---");
        service.devolverLivro(99, 99);

        System.out.println("\n--- Estado final dos usuários ---");
        service.listaUsuarios();

        System.out.println("\n--- Estado final dos livros ---");
        service.listaLivros();

        System.out.println("\n--- Estado final dos empréstimos ---");
        service.listaEmprestimos();

        System.out.println("\n||----- TESTE MASSIVO FINALIZADO -----||");


        scanner.close();
    }
}