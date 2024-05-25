package Map.PesquisaMap.EstoqueDeProdutosComPrecoMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto : estoqueProdutosMap.values()){
                System.out.println(produto);
            }
        }else{
            System.out.println("O estoque está vazio!");
        }
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto : estoqueProdutosMap.values()){
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            }
        }else{
            System.out.println("O estoque está vazio!");
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto : estoqueProdutosMap.values()){
                if(produto.getPreco() > maiorPreco){
                    produtoMaisCaro = produto;
                }
            }
        }else{
            System.out.println("O estoque está vazio!");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarrato = null;
        double maiorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto : estoqueProdutosMap.values()){
                if(produto.getPreco() < maiorPreco){
                    produtoMaisBarrato = produto;
                }
            }
        }else{
            System.out.println("O estoque está vazio!");
        }
        return produtoMaisBarrato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }
}
