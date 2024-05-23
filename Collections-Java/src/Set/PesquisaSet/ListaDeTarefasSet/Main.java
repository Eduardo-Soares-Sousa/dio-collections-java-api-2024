package Set.PesquisaSet.ListaDeTarefasSet;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();

        listaTarefas.contarTarefas();

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        Set<Tarefa> tarefasConcluidas = listaTarefas.obterTarefasConcluidas();
        if(tarefasConcluidas.isEmpty()){
            System.out.println("Nenhuma tarefa foi concluída");
        }else{
            System.out.println(tarefasConcluidas);
        }

        Set<Tarefa> tarefasPendentes = listaTarefas.obterTarefasPendentes();
        if(tarefasPendentes.isEmpty()){
            System.out.println("Todas as tarefas estâo concluidas");
        }else{
            System.out.println(tarefasPendentes);
        }

        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
