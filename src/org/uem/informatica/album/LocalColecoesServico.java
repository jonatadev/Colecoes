package org.uem.informatica.album;
// Uma implementação de ColecoesServico que armazena os dados e executa as
import java.util.List;

// operações localmente. Todas as operações de armazenamento e recuperação de
// dados são feitas através da instância dao.
public class LocalColecoesServico implements ColecoesServico {

    private final ColecoesDao dao;

    public LocalColecoesServico(ColecoesDao dao) {
        this.dao = dao;
    }

    // Insere um álbum no banco de dados database.
    @Override
    public void criarAlbum(Album album) {
        album.setId();
        dao.salvarAlbum(album);
    }

    // Exibe todos os albums cadastrados no banco de dados.
    @Override
    public List<Album> listagemAlbuns() {
        return dao.todosAlbuns();
    }

    // retorna um album  pelo id. 
    @Override
    public Album mostrarDetalhesAlbun(int idAlbum) {
        return dao.encontrartAlbumId(idAlbum);
    }
    
    
    
    // Cria uma nova coleção no respectivo álbum
    @Override
    public void criarNovaColecao(int idAlbum, Colecao colecao) {
            dao.salvarColecao(ajustaIndice(idAlbum), colecao);
    }
    
    // Adicionar figurinhas a colecao.
    @Override
    public void adicionarFigurinhaColecao(int idAlbum, String nomeColecao) {
        
    }
    
    
    // metódos uteis
    // ajusta o id de acordo com o indice do ArrayList
    public static int ajustaIndice(int idAlbum) {
         if(idAlbum <= 1) {
               return idAlbum = 0;
            } 
         return idAlbum -= 1;
    }
}
