package org.uem.informatica.album;

// Cada método desta interface é responsável por uma funcionalidade do programa.

import java.util.List;

// Os métodos declarados nesta interface devem ser implementados na classe
// LocalColecoesServico.

public interface ColecoesServico {
      void criarAlbum(Album album);
      List<Album> listagemAlbuns();
      void criarNovaColecao(int idAlbum, Colecao colecao);
      Album mostrarDetalhesAlbun(int idAlbum);
      void adicionarFigurinhaColecao(int idAlbum, String nomeColecao);
    //void exibirColecoes();
   // void trocarFigurinhas();
}
