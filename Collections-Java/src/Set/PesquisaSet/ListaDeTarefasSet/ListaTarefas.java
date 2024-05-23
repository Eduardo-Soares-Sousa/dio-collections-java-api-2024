package Set.PesquisaSet.ListaDeTarefasSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa tarefas : tarefaSet){
                if(tarefas.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemover = tarefas;
                    break;
                }
            }
            tarefaSet.remove(tarefaRemover);
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }

        if(tarefaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if(!tarefaSet.isEmpty()){
            for(Tarefa tarefas: tarefaSet){
                System.out.println(tarefas);
            }
//            System.out.println(tarefaSet);
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void contarTarefas() {
        System.out.println("Você possui " + tarefaSet.size() + " tarefas em sua lista!");
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa concluida : tarefaSet){
                if(concluida.isConcluido()){
                    tarefasConcluidas.add(concluida);
                }
            }
            return tarefasConcluidas;
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
        return null;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa pendente : tarefaSet){
                if(!pendente.isConcluido()){
                    tarefasPendentes.add(pendente);
                }
            }
            return tarefasPendentes;
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
        return null;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa concluir : tarefaSet){
                if(concluir.getDescricao().equalsIgnoreCase(descricao)){
                    concluir.setConcluido(true);
                }
            }
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
//        Tarefa marcarPendente = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa pendente : tarefaSet){
                if(pendente.getDescricao().equalsIgnoreCase(descricao)){
                    pendente.setConcluido(false);
                    break;
                }
            }

//            if(marcarPendente != null){
//                if(marcarPendente.isConcluido()){
//                    marcarPendente.setConcluido(false);
//                }
//            }else{
//                System.out.println("Tarefa não encontrada na lista.");
//            }
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void limparListaTarefas() {
        if(tarefaSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefaSet.clear();
        }
    }
}

