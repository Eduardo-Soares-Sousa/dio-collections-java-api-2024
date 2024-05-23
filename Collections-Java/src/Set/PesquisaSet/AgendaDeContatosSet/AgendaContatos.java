package Set.PesquisaSet.AgendaDeContatosSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if(!contatoSet.isEmpty()){
            System.out.println(contatoSet);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for(Contato contatos : contatoSet) {
                if(contatos.getNome().startsWith(nome)){
                    contatosPorNome.add(contatos);
                }
            }
            return contatosPorNome;
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        if(!contatoSet.isEmpty()){
        Contato contatoAtualizado = null;
            for(Contato  contatos : contatoSet) {
                if (contatos.getNome().equalsIgnoreCase(nome)) {
                    contatos.setNumero(novoNumero);
                    contatoAtualizado = contatos;
                    break;
                }
            }
            return contatoAtualizado;
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
}
