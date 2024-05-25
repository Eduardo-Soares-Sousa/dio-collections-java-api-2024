package Set.OperacoesBasicasSet.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public Convidado removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado convidados : convidadoSet){
            if(convidados.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidados;
                break;
            }
        }
        if(convidadoParaRemover != null){
            convidadoSet.remove(convidadoParaRemover);
        }

        return convidadoParaRemover;
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }
}
