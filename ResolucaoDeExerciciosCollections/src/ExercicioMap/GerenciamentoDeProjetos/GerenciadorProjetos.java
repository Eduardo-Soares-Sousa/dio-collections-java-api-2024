package ExercicioMap.GerenciamentoDeProjetos;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorProjetos {
    private Map<Projeto, String> projetoMap;
    private static GerenciadorProjetos instance;

    private GerenciadorProjetos() {
        this.projetoMap = new HashMap<>();
    }

    public static GerenciadorProjetos getInstance() {
        if(instance == null){
            instance = new GerenciadorProjetos();
        }
        return instance;
    }

    public void adicionarProjeto(String nomeProjeto, String descricao, String nomeGerente) {
        Projeto novoProjeto = new Projeto(nomeProjeto, descricao);
        projetoMap.put(novoProjeto, nomeGerente);
    }

    public void removerProjeto(String nomeProjeto) {
        if(!projetoMap.isEmpty()){
            projetoMap.remove(nomeProjeto);
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public String obterGerenteProjeto(String nomeProjeto) {
        if(!projetoMap.isEmpty()){
            return projetoMap.get(nomeProjeto);
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Map<String, String> obterProjetos() {
        Map<String, String> resultado = new HashMap<>();
        for (Map.Entry<Projeto, String> entry : projetoMap.entrySet()) {
            resultado.put(entry.getKey().getNome(), entry.getValue());
        }
        return resultado;
    }
}
