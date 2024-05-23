package List.OrdenacaoEmList.OrdenacaoDeNumerosList;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(17);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(90);
        numeros.adicionarNumero(28);
        numeros.adicionarNumero(54);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }
}
