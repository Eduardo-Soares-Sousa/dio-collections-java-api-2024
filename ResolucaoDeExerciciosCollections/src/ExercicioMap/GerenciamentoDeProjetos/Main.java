package ExercicioMap.GerenciamentoDeProjetos;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GerenciadorProjetos gp = GerenciadorProjetos.getInstance();
        gp.adicionarProjeto("Projeto A", "Descrição do Projeto A", "Gerente 1");
        gp.adicionarProjeto("Projeto B", "Descrição do Projeto B", "Gerente 2");

        System.out.println("Gerente do Projeto A: " + gp.obterGerenteProjeto("Projeto A"));

        System.out.println("Todos os projetos e gerentes:");
        for (Map.Entry<String, String> entry : gp.obterProjetos().entrySet()) {
            System.out.println("Projeto: " + entry.getKey() + ", Gerente: " + entry.getValue());
        }

        gp.removerProjeto("Projeto A");

        System.out.println("Projetos após remoção do Projeto A:");
        for (Map.Entry<String, String> entry : gp.obterProjetos().entrySet()) {
            System.out.println("Projeto: " + entry.getKey() + ", Gerente: " + entry.getValue());
        }
    }
}