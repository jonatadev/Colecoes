package revisao_java;
public class Pessoa {
      static int proximoId = 1;
      long id;
      String nome;
}


class Exemplo {
      public static void main(String[] args) {
            //System.out.println(Pessoa.proximoId); // 1
            
            Pessoa jose = new Pessoa();
            Pessoa pedro = new Pessoa();
            
            jose.nome = "jose";
            jose.id = Pessoa.proximoId;
            Pessoa.proximoId += 1;
            
            pedro.nome = "Pedro";
            pedro.id = Pessoa.proximoId;
            Pessoa.proximoId += 1;
            
            System.out.println(jose.id);
            System.out.println(pedro.id);
      }
}
