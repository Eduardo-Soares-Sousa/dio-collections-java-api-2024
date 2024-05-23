package List.PesquisaList.SomaNumerosList;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Número adicionados à lista: ");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("O maior número da lista é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: " + somaNumeros.encontrarMenorNumero());
    }
}
