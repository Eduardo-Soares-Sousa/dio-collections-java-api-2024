package List.OperacoesBasicas.TarefaList;

import List.OperacoesBasicas.TarefaList.ListaTarefas;
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O número atual de tarefas é: " + listaTarefas.obterNumeroTotalTarefa());

        listaTarefas.adicionarTarefa("Limpar casa");
        listaTarefas.adicionarTarefa("Limpar casa");
        listaTarefas.adicionarTarefa("Estudar para a prova");
        System.out.println("O número atual de tarefas é: " + listaTarefas.obterNumeroTotalTarefa());

        listaTarefas.obterDescricoesTarefas();
    }
}