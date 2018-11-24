package org.uem.informatica.album;
/*
import java.util.Scanner;

public class ImplColecoesServicos implements ColecoesServico {
      // A implementação de ColecoesServico vai usar 
      // internamente a implementação de ColecoesDAO;
      Scanner input = new Scanner(System.in);
      ColecoesDao Dao = new ImpMemoriaColecaoDao();

      // Dois álbuns distintos não podem ter o mesmo título. 
      @Override
      public void criarAlbum() {
            String nomeAlbum = input.nextLine();
                     Album album = new Album();
                     album.setId();
                     album.setTitulo(nomeAlbum);
                     Dao.salvarAlbum(album);
      }
      // Mostar o id e o nome do respectivo album.
      @Override
      public void listagemAlbuns() {
            for(Album ab: Dao.todosAlbuns()){
                  System.out.println(ab.getId()
                          +" - "+ ab.getTitulo());
            }
      }
      
      @Override
      public void mostrarDetalhesAlbuns() {
            int idAlbum = input.nextInt();
            System.out.println("Titulo: " + 
                    Dao.encontrartAlbumId(idAlbum)
                       .getTitulo());
            System.out.println("Quantidade figurinhas: " + 
                    Dao.encontrartAlbumId(idAlbum)
                       .getTotalFigurinhas());
      }

      @Override
      public void criarNovaColecao() {
            int idAlbum = input.nextInt();            
            if(idAlbum <= 1) {
                idAlbum = 0;
            } else {
                idAlbum -= 1;
            }            
            String nomeColecao = input.nextLine();
            Colecao colecao = new Colecao();            
            Dao.salvarColecao(idAlbum, colecao);
            System.out.println("Coleçao " + idAlbum + "cha/" + nomeColecao + " criada.");
      }

    @Override
    public void adicionarFigurinhaColecao() {
        int idAlbum = input.nextInt();
        String nomeColecao = input.nextLine();
        for(Colecao col : Dao.todasColecoes(idAlbum)) {
            if(col.getNome() == nomeColecao) {
                
            }
        }
        //int figurinhas = new int[]
    }
      
      
      
      public static void main(String[] args) {
            ColecoesServico SRV = new ImplColecoesServicos();
            int i = 1;
            while(i <=2) {
                  SRV.criarAlbum();
                  i++;
            }
            System.out.println("Listagem de Albuns");
            SRV.listagemAlbuns();
            System.out.println("criar coleção");
            SRV.criarNovaColecao();
            SRV.mostrarDetalhesAlbuns();
      }
}
*/