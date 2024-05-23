package Set.OperacoesBasicasSet.ConjuntoDePalavrasUnicasSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public Set<String> getPalavrasUnicasSet() {
        return palavrasUnicasSet;
    }

    public void setPalavrasUnicasSet(Set<String> palavrasUnicasSet) {
        this.palavrasUnicasSet = palavrasUnicasSet;
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!palavrasUnicasSet.isEmpty()){
            if(palavrasUnicasSet.contains(palavra)){
                palavrasUnicasSet.remove(palavra);
            }else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        if(!palavrasUnicasSet.isEmpty()){
            return palavrasUnicasSet.contains(palavra);
        }else{
            System.out.println("O conjunto está vazio!");
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }
}
