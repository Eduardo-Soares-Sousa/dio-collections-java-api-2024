package List.PesquisaList.CatalogoLivroList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>(); //Instancia um ArrayList direto no construtor, assim não é necessário a instanciação no método Main
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livros : livroList){
                if(livros.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livros);
                }
            }
        }else {
            System.out.println("O catálogo de livros está vazio!");
        }

        if(livrosPorAutor.size() == 0){
            System.out.println("Não há livros com esse autor!");
            return null;
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livros : livroList){
                if(livros.getAnoPublicacao() >= anoInicial && livros.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(livros);
                }
            }
        }else {
            System.out.println("O catálogo de livros está vazio!");
        }

        if(livrosPorIntervaloAno.size() == 0){
            System.out.println("Não há livros publicados neste intervalo de anos!");
            return null;
        }

        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro titulos : livroList) {
                if(titulos.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = titulos;
                    break;
                }
            }
        }else {
            System.out.println("O catálogo de livros está vazio!");
        }

        if(livrosPorTitulo == null){
            System.out.println("Não há livros com esse título!");
            return null;
        }

        return livrosPorTitulo;
    }
}
