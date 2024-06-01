package ExerciciosList.PlaylistDeMusicas;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Musica> musicaList;

    public Playlist() {
        this.musicaList = new ArrayList<>();
    }

    public void adicionarMusica(String nome, String artista, int duracao) {
        musicaList.add(new Musica(nome, artista, duracao));
    }

    public void removerMusica(String nome) {
        List<Musica> musicaRemovida = new ArrayList<>();
        if(!musicaList.isEmpty()){
            for(Musica musicas : musicaList) {
                if(musicas.getNome().equalsIgnoreCase(nome)){
                    musicaRemovida.add(musicas);
                    break;
                }
            }
            musicaList.removeAll(musicaRemovida);
        }else{
            System.out.println("A Playlist está vazia!");
        }
    }

    public int calcularDuracaoTotal() {
        int duracao = 0;
        if(!musicaList.isEmpty()){
            for(Musica musicas : musicaList){
                duracao += musicas.getDuracao();
            }
            return duracao;
        }else{
            throw new RuntimeException("A Playlist está vazia!");
        }
    }

    public void exibirMusicas() {
        if(!musicaList.isEmpty()){
            for(Musica musica : musicaList){
                System.out.println(musica);
            }
        }else{
            System.out.println("A playlist está vazia!");
        }
    }
}
