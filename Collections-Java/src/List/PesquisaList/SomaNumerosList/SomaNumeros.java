package List.PesquisaList.SomaNumerosList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public void adicionarNumero(int numero) {
        this.integerList.add(numero);
    }

    public int calcularSoma() {
        if(!integerList.isEmpty()){
            int total = 0;
            for(Integer numero : integerList) {
                total += numero;
            }
            return total;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMaiorNumero() {
        if(!integerList.isEmpty()){
            int maiorNumero = Integer.MIN_VALUE;
            for(Integer numero : integerList) {
                if(numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        if(!integerList.isEmpty()){
            int menorNumero = Integer.MAX_VALUE;
            for(Integer numero : integerList) {
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if(!integerList.isEmpty()){
            System.out.println(this.integerList);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

}
