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

        scanner.close();
    }
}