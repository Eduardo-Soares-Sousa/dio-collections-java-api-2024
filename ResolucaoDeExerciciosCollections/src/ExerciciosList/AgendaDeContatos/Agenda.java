package ExerciciosList.AgendaDeContatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Agenda {
    private List<Contato> contatoList;

    public Agenda() {
        this.contatoList = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone, String email) {
        contatoList.add(new Contato(nome, telefone, email));
    }

    public void removerContato(String nome) {
        List<Contato> contatoRemover = new ArrayList<>();
        if(!contatoList.isEmpty()){
            for(Contato contato : contatoList){
                if(contato.getNome().equalsIgnoreCase(nome)){
                    contatoRemover.add(contato);
                    break;
                }
            }
            contatoList.removeAll(contatoRemover);
        }else{
            System.out.println("A lista de contatos está vazia!");
        }
    }

    public void atualizarEmailContato(String nome, String novoEmail) {
        if(!contatoList.isEmpty()){
            for(Contato contato : contatoList){
                if(contato.getNome().equalsIgnoreCase(nome)){
                    contato.setEmail(novoEmail);
                    break;
                }
            }
        }else{
            System.out.println("A lista de contatos está vazia!");
        }
    }

    public void exibirContatos(){
        Set<Contato> exibirContatos = new TreeSet<>(contatoList);
        if(!contatoList.isEmpty()){
            System.out.println(exibirContatos);
        }else{
            System.out.println("A lista de contatos está vazia!");
        }
    }
}
