package ExerciciosList.BibliotecaDeLivros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livroList;

    public Biblioteca() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor) {
        livroList.add(new Livro(titulo, autor));
    }

    public void removerLivro(String titulo) {
        List<Livro> livroRemover = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro remover : livroList){
                if(remover.getTitulo().equalsIgnoreCase(titulo)){
                    livroRemover.add(remover);
                    break;
                }
            }
            livroList.removeAll(livroRemover);
        }else{
            System.out.println("Não há livros cadastrados na lista!");
        }
    }

    public int obterNumeroTotalLivros() {
        return livroList.size();
    }

    public List<String> obterTitulosLivros() {
        List<String> livrosTitulo = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro titulos : livroList){
                livrosTitulo.add(titulos.getTitulo());
            }
            return livrosTitulo;
        }else{
            throw new RuntimeException("Não há livros cadastrados na lista!");
        }
    }
}
