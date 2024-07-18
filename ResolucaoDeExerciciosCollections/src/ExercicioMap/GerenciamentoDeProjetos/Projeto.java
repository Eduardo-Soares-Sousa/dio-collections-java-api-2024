package ExercicioMap.GerenciamentoDeProjetos;

public class Projeto {
    private String nome;
    private String descricao;

    public Projeto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Projeto projeto = (Projeto) o;

        return nome.equals(projeto.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
