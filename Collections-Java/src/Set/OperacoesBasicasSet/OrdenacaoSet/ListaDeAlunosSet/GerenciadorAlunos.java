package Set.OperacoesBasicasSet.OrdenacaoSet.ListaDeAlunosSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoRemover = null;
        if(!alunoSet.isEmpty()){
            for(Aluno aluno : alunoSet) {
                if(aluno.getMatricula() == matricula){
                    alunoRemover = aluno;
                    break;
                }
            }
            if(alunoRemover != null){
                alunoSet.remove(alunoRemover);
            }
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }

        if(alunoRemover == null){
            System.out.println("Matricula não encontrada!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> exibirPorNome = new TreeSet<>(alunoSet);
        if(!alunoSet.isEmpty()){
            System.out.println(exibirPorNome);
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> exibirPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!alunoSet.isEmpty()){
            exibirPorNota.addAll(alunoSet);
            System.out.println(exibirPorNota);
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }
}
