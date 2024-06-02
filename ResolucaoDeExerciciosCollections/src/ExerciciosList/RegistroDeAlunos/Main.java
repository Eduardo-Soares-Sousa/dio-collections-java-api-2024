package ExerciciosList.RegistroDeAlunos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegistroAluno registroAluno = new RegistroAluno();

        registroAluno.adicionarAluno("Gabriel", 10);
        registroAluno.adicionarAluno("Jennifer", 10);
        registroAluno.adicionarAluno("Matheus", 10);
        registroAluno.adicionarAluno("Isabela", 10);
        registroAluno.adicionarAluno("João", 10);

        registroAluno.obterNomesAlunos();
        List<String> alunos =  registroAluno.obterNomesAlunos();
        for(String a : alunos){
            System.out.println(a);
        }

        System.out.println("Há " + registroAluno.obterNumeroTotalAlunos() + " alunos registrados");

        registroAluno.removerAluno("Matheus");

        System.out.println("Há " + registroAluno.obterNumeroTotalAlunos() + " alunos registrados");

        List<String> aluno =  registroAluno.obterNomesAlunos();
        for(String a : aluno){
            System.out.println(a);
        }
    }
}
