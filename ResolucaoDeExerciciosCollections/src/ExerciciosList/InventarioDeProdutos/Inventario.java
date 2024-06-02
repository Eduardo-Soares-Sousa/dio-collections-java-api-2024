package ExerciciosList.InventarioDeProdutos;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Produto> produtoList;

    public Inventario() {
        this.produtoList = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        produtoList.add(new Produto(nome, preco, quantidade));
    }

    public void removerProduto(String nome) {
        List<Produto> produtoRemover = new ArrayList<>();
        if(!produtoList.isEmpty()){
            for(Produto produto : produtoList){
                if(produto.getNome().equalsIgnoreCase(nome)){
                    produtoRemover.add(produto);
                    break;
                }
            }
            produtoList.removeAll(produtoRemover);
        }else{
            System.out.println("O estoque está vazio");
        }
    }

    public void atualizarQuantidadeProduto(String nome, int quantidade) {
        if(!produtoList.isEmpty()){
            for(Produto produto : produtoList){
                if(produto.getNome().equalsIgnoreCase(nome)){
                    produto.setQuantidadeEstoque(quantidade);
                    break;
                }
            }
        }else{
            System.out.println("O estoque está vazio");
        }
    }

    public double calcularValorTotalEstoque() {
        double totalEstoque = 0;
        if(!produtoList.isEmpty()){
            for(Produto produto : produtoList){
                totalEstoque += produto.getPreco() * produto.getQuantidadeEstoque();
            }
            return totalEstoque;
        }else{
            throw new RuntimeException("O estoque está vazio");
        }
    }

    public void ImprimirProdutosEstoque() {
        if(!produtoList.isEmpty()){
            for(Produto produto : produtoList){
                System.out.println(produto);
            }
        }else{
            System.out.println("O estoque está vazio");
        }
    }
}
