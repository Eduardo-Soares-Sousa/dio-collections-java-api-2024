package Map.PesquisaMap.ContagemDePalavrasMap;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirContagemPalavras() {
        if(!palavrasMap.isEmpty()){
            System.out.println(palavrasMap);
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }
}
