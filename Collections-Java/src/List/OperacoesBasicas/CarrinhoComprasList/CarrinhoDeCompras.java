package List.OperacoesBasicas.CarrinhoComprasList;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaCarrinho;

    public CarrinhoDeCompras() {
        this.listaCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        if(!listaCarrinho.isEmpty()){
            for(Item itens : itemParaRemover) {
                if(itens.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(itens);
                }
            }
            listaCarrinho.removeAll(itemParaRemover);
        }else{
            System.out.println("O carrinho esta vazio!");
        }

    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        if(!listaCarrinho.isEmpty()){
            for(Item calcularTotal : listaCarrinho) {
                double valorItem = calcularTotal.getPreco() * calcularTotal.getQuantidade();
                valorTotal += valorItem;
            }
        }else{
            throw new RuntimeException("O carrinho esta vazio!");
        }


        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaCarrinho);
    }
}
