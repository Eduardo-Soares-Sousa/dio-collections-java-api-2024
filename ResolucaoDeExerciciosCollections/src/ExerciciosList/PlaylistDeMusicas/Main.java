package ExerciciosList.PlaylistDeMusicas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a sua playlist");
        boolean sair = false;
        while(sair != true){
            System.out.println("\t\tDigite a opcao desejada.");
            System.out.println("\t1 - Adicionar uma música na playlist: ");
            System.out.println("\t2 - Remover uma música da playlist: ");
            System.out.println("\t3 - Saber a duração total da playlist: ");
            System.out.println("\t4 - Exibir todas as músicas da playlist: ");
            System.out.println("\t0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("\tAdicionar nova música");
                    System.out.println("Digite o nome da música: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o nome do artista: ");
                    String artista = scanner.nextLine();
                    System.out.println("Digite a duração da música (em segundos): ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine();
                    playlist.adicionarMusica(nome, artista, duracao);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\tRemover música");
                    System.out.println("Digite o nome da música que será removida: ");
                    String nomeDaMusica = scanner.nextLine();
                    playlist.removerMusica(nomeDaMusica);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\tDuração total da playlist");
                    System.out.println("A playlist possui a duração de: " + playlist.calcularDuracaoTotal() + " segundos");
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\tMúsicas na playlist");
                    playlist.exibirMusicas();
                    System.out.println("\n");
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("Sistema encerrado!");
    }
}
