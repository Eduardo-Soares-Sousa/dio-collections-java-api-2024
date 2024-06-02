package ExerciciosList.InventarioDeProdutos;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.adicionarProduto("controle", 40, 10);
        inventario.adicionarProduto("teclado", 90, 15);
        inventario.adicionarProduto("caderno", 10, 20);
        inventario.adicionarProduto("ventilador", 80, 5);
        inventario.adicionarProduto("cobertor", 60, 7);

        inventario.ImprimirProdutosEstoque();
        System.out.println("\n");
        System.out.println("O valor total do estoque é de: " + inventario.calcularValorTotalEstoque() + " Reais");
        System.out.println("\n");
        inventario.removerProduto("teclado");
        System.out.println("\n");
        inventario.ImprimirProdutosEstoque();
        System.out.println("\n");
        inventario.atualizarQuantidadeProduto("caderno", 50);
        System.out.println("\n");
        inventario.ImprimirProdutosEstoque();
    }
}
