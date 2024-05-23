package Set.OperacoesBasicasSet.ConjuntoDeConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);
        conjuntoConvidados.adicionarConvidado("Gabriel", 1237);
        conjuntoConvidados.adicionarConvidado("Amanda", 1238);
        conjuntoConvidados.adicionarConvidado("Jéssica", 1239);

        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        Convidado removido = conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Removido: " + removido.getNome() + " com o código do convite: " + removido.getCodigoConvite());
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }
}
