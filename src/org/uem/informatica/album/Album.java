package org.uem.informatica.album;

import java.util.ArrayList;
import java.util.List;

public class Album {
      private static int proximoId = 1;
      private int id;
      private int totalFigurinhas;
      private String titulo;
      private List<Colecao> colecao = new ArrayList<>(); 
      
      
      public Album() {}

      public static int getProximoId() {
            return proximoId;
      }

      public static void setProximoId() {
            Album.proximoId += 1;
      }

      public int getId() {
            return id;
      }

      public void setId() {
            this.id = Album.getProximoId();
            Album.setProximoId();
      }

      public int getTotalFigurinhas() {
            return totalFigurinhas;
      }

      public void setTotalFigurinhas() {
            colecao.get(getId()).
                    totalFigurinhasColecao(); 
      }

      public String getTitulo() {
            return titulo;
      }

      public void setTitulo(String titulo) {
            this.titulo = titulo;
      }

      public List<Colecao> getColecao() {
            return colecao;
      }

      public void setColecao(Colecao colecao) {
            this.colecao.add(colecao);
      }
      
      
      public static void main(String[] args) {
            Album parana = new Album();
            Album naruto = new Album();
            Album chaves = new Album();
            
            List<Album>database = new ArrayList<>();
            
            parana.setId();
            parana.setTitulo("brasil");
            naruto.setId();
            naruto.setTitulo("naruto");
            chaves.setId();
            chaves.setTitulo("chaves");
            database.add(parana); database.add(naruto); database.add(chaves);
            
            Colecao curitiba = new Colecao();
            curitiba.setNome("curitiba");
            Colecao maringa = new Colecao();
            maringa.setNome("maringa");
            Colecao londrina = new Colecao();
            londrina.setNome("londrina");
            
            database.get(0).setColecao(curitiba);
            database.get(0).setColecao(maringa);
            database.get(0).setColecao(londrina);
            
            int figNovas[] = {10,20,30,70,50};
            int figExclusivas[] = {10,20,30,40,50};
            int figRep[] = {};
            
            comparaVetor(figNovas, figExclusivas);
            //int[] c = comparaVetor(figNovas, figExclusivas);
            //exibirVetor(c); // 70
            
            
      } 
      
      public static void exibirVetor(int[] vetor) {
            for(int i = 0; i < vetor.length; i++) {
                  if(vetor[i] != 0)
                  System.out.print(" " + vetor[i]);
            }
            System.out.println("");
      }
      
      public static /*int[]*/ void comparaVetor(int[]a, int[] b) {
            int[] c = {};
            for(int i = 0; i < a.length; i++) {
                for(int j = 0; j < b.length; j++) {
                      if(a[i] != b[j]) {
                            int k = 0;
                            c[k] = a[i];
                            System.out.println(c[k]);
                      }
                }  
            }
            //return c;
      }
      
}
