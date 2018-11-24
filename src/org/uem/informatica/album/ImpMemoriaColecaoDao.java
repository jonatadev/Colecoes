package org.uem.informatica.album;

import java.util.ArrayList;
import java.util.List;

public class ImpMemoriaColecaoDao implements ColecoesDao {
      List<Album> database = new ArrayList<>();
              
      @Override
      public  void salvarAlbum(Album album) {
            this.database.add(album);
      }

      @Override
      public Album encontrartAlbumId(int id) {
            for(Album ab : database) { 
                  if(ab.getId() == id) {
                        return ab;
                  } 
            }
            return null;
      }
      
      @Override
      public List<Album> todosAlbuns() {
            return database;
      }
      
      @Override
      public void salvarColecao(int idAlbum, Colecao colecao) {
            database.get(idAlbum)
                    .setColecao(colecao);
      }

    @Override
    public List<Colecao> todasColecoes(int idAlbum) {
        return database.get(idAlbum)
                       .getColecao();
    }
}
