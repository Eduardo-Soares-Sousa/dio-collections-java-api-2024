package Map.OperacoesBasicasMap.DicionarioMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirPalavras() {
        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = null;
        if(!dicionarioMap.isEmpty()){
            definicao = dicionarioMap.get(palavra);
            if(definicao != null){
                return definicao;
            }
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }

        return "Está palavra não está no dicionário";
    }
}
