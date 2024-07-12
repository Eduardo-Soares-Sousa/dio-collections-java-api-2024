package ExercicioMap.DicionarioDePalavras;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = Dicionario.getInstance();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");

        String definicaoJava = dicionario.obterSignificado("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        System.out.println(dicionario.obterPalavras());
    }
}
