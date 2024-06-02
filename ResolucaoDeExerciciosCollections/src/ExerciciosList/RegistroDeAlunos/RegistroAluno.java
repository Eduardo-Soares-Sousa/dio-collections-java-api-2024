package ExerciciosList.RegistroDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RegistroAluno {
    private List<Aluno> alunoList;

    public RegistroAluno() {
        this.alunoList = new ArrayList<>();
    }

    public void adicionarAluno(String nome, int idade) {
        alunoList.add(new Aluno(nome, idade));
    }

    public void removerAluno(String nome) {
        List<Aluno> alunoRemover = new ArrayList<>();
        if(!alunoList.isEmpty()){
            for(Aluno aluno : alunoList){
                if(aluno.getNome().equalsIgnoreCase(nome)){
                    alunoRemover.add(aluno);
                    break;
                }
            }
            alunoList.removeAll(alunoRemover);
        }else{
            System.out.println("Não há alunos no registro!");
        }
    }

    public int obterNumeroTotalAlunos() {
        int totalAluno = alunoList.size();
        return totalAluno;
    }

    public List<String> obterNomesAlunos() {
        List<String> obterAlunosNome = new ArrayList<>();
        if(!alunoList.isEmpty()){
            for(Aluno aluno : alunoList){
                obterAlunosNome.add(aluno.getNome());
            }
            return obterAlunosNome;
        }else{
            throw new RuntimeException("A lista de alunos está vazia!");
        }
    }
}
