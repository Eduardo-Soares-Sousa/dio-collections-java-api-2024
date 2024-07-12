package ExercicioMap.DicionarioDePalavras;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;
    private static Dicionario instance;

    private Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public static Dicionario getInstance() {
        if(instance == null){
            instance = new Dicionario();
        }
        return instance;
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

    public String obterSignificado(String palavra) {
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

    public Map<String, String> obterPalavras() {
        if(!dicionarioMap.isEmpty()){
            return dicionarioMap;
        }else{
            System.out.println("O conjunto está vazio!");
        }
        return null;
    }
}
