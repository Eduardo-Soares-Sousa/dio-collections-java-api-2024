package List.OrdenacaoEmList.OrdenacaoDeNumerosList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public List<Integer> getNumeroList() {
        return numeroList;
    }

    public void setNumeroList(List<Integer> numeroList) {
        this.numeroList = numeroList;
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenarCrescente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            Collections.sort(ordenarCrescente);
            return ordenarCrescente;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordenarDecrescente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            ordenarDecrescente.sort(Collections.reverseOrder());
            return ordenarDecrescente;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if(!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }else{
            System.out.println("A lista está vazia!");
        }
    }


}
