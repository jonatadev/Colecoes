package org.uem.informatica.album;


public class Colecao {
      private String nome;
      private int[] figurinhasUnicas = new int[10];
      private int[] figurinhasRepetidas = new int[10];

      public Colecao() {}

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

    public int[] getFigurinhasUnicas() {
        return figurinhasUnicas;
    }

    public void setFigurinhasUnicas(int[] figurinhasUnicas) {
        this.figurinhasUnicas = figurinhasUnicas;
    }

    public int[] getFigurinhasRepetidas() {
        return figurinhasRepetidas;
    }

    public void setFigurinhasRepetidas(int[] figurinhasRepetidas) {
        this.figurinhasRepetidas = figurinhasRepetidas;
    }
      
    public int totalFigurinhasColecao() {
            int total = getFigurinhasUnicas().length +
                        getFigurinhasRepetidas().length;
            return total;
      }
}
