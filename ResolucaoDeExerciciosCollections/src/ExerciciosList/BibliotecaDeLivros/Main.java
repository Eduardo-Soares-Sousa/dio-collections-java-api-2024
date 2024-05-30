package ExerciciosList.BibliotecaDeLivros;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo à nossa biblioteca!");
        boolean sair = false;
        while(sair != true){
            System.out.println("Digite a opcao desejada.");
            System.out.println("1 - Adicionar um livro: ");
            System.out.println("2 - Remover um livro: ");
            System.out.println("3 - Saber quantos livros a biblioteca possui: ");
            System.out.println("4 - Visualizar todos os livros pelo título: ");
            System.out.println("0 - sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o nome do autor do livro: ");
                    String autor = scanner.nextLine();
                    biblioteca.adicionarLivro(titulo, autor);
                    break;
                case 2:
                    System.out.println("Digite o título do livro para ele ser removido do sistema: ");
                    String removerTitulo = scanner.nextLine();
                    biblioteca.removerLivro(removerTitulo);
                    break;
                case 3:
                    System.out.println("A biblioteca possui: " + biblioteca.obterNumeroTotalLivros() + " livros");
                    break;
                case 4:
                    System.out.println("Livros possuidos: ");
                    List<String> titulos = biblioteca.obterTitulosLivros();
                    for(String t : titulos){
                        System.out.println(t);
                    }
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("Sistema encerrado. Tenha um bom dia :)");
    }
}
