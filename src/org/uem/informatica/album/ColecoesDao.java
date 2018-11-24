package org.uem.informatica.album;

// Esta interface deve conter métodos que armazenam e recuperam os dados

import java.util.List;

// inseridos no programa. Alguns possíveis métodos
// - salvaAlbum, armazena um álbum que pode ser recuperado posteriormente;
// - encontraAlbumPorId, recebe um id e devolve um álbum com este id (se
//   existir)
// - todosAlbuns, devolve uma lista com todos os álbuns
//
// Você deve criar uma implementação desta interface que armazena os dados em
// memória. Da mesma forma que a classe LocalColecoesServico tem uma classe de
// testes LocalColecoesServicoTest associada, a classe que você criar para
// implementar a interface ColecoesDao também deve ter uma classe de testes.

public interface ColecoesDao {
      void salvarAlbum(Album album);
      List<Album> todosAlbuns();
      Album encontrartAlbumId(int id);
      
      void salvarColecao(int idAlbum,Colecao colecao);
      List<Colecao> todasColecoes(int idAlbum);
}
