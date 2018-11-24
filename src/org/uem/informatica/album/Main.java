package org.uem.informatica.album;

import java.io.PrintStream;
import java.util.Scanner; 

// Classe principal que implementa uma interface orientada a comandos com o
// usuário.
//
// Para executar este programa pressione F6 no netbeans.
//
// Para executar este programa no terminal construa o projeto (F11 no
// netbeans), abra o terminal e mude para o diretório do projeto e execute:
// java -jar dist/Colecoes.jar
public class Main {

    final static String PROMPT = "> ";
    final PrintStream saida;
    final Scanner entrada;
    final ColecoesServico servico;
    
    Scanner io = new Scanner(System.in);
    
    public Main(Scanner entrada, ColecoesServico servico, PrintStream saida) {
        this.entrada = entrada;
        this.servico = servico;
        this.saida = saida;
    }

    public void executa() {
        loop:
        while (true) {
            String comando = leComand();
            // Cada comando deve efetuar uma chamada de método de servico
            // ex: service.novoAlbum(parametros...)
            // Se o código dentro de um case ficar muito extenso, você deve
            // criar um novo método, ex executaComandoNovoAlbum
            switch (comando) {
                case "sair":
                    break loop;
                case "novo album":
                      String nome = io.nextLine();
                      Album album = new Album();
                      album.setTitulo(nome);
                      servico.criarAlbum(album);
                      System.out.println("Álbum " + album.getId() + " criado.");
                    break;
                case "albums":
                      for(Album albums : servico.listagemAlbuns()) {
                          System.out.println(albums.getId() + " - " 
                                  + albums.getTitulo());
                       }
                    break;
                    
                case "mostrar":
                      int idAlbum = io.nextInt();
                      Album albumDetalhes = servico.mostrarDetalhesAlbun(idAlbum);
                      System.out.println("Titulo: " + albumDetalhes.getTitulo());
                      System.out.println("Quantidade Figurinhas: " + albumDetalhes.getTotalFigurinhas());
                    break;
                    
                case "nova colecao":
                    int idAlbumCol = io.nextInt();
                    String nomeColecao = io.nextLine();
                    Colecao colecao = new Colecao();
                    colecao.setNome(nomeColecao);
                    servico.criarNovaColecao(idAlbumCol, colecao);
                    System.out.println("Colecao " + idAlbumCol + "/" +nomeColecao+ " criada.");
                    break;
                    
                case "adicionar":
                    int idAlbumFig = io.nextInt();
                    String nomeColecaoFig = io.nextLine();
                    
                    break;
                default:
                    saida.println("Comando inválido: " + comando);
            }
        }
    }

    String leComand() {
        while (true) {
            saida.print(PROMPT);
            String comando = entrada.nextLine().trim();
            if (!comando.isEmpty()) {
                return comando;
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Outra implementação de ColecoesService, como por exemplo uma que
        // executa remotamente, pode ser usada sem que o código de interface do
        // usuário tenha que ser alterado.
        //
        // Uma instância de classe que implementa ColecoesDao deve ser passada
        // como parâmetro ao invés de null.
        
        ColecoesDao ImpDAO = new ImpMemoriaColecaoDao(); 
        
        ColecoesServico servico = new LocalColecoesServico(ImpDAO);
        Main main = new Main(entrada, servico, System.out);
        main.executa();
        
    }
}
