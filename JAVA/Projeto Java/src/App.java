import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {

        // CRIANDO UM OBJETO COM DADOS DE UMA CLASSE
      //   Celular celularA = new Celular();
      //   celularA.nome = "IPhone 12";
      //   celularA.tela = 6.1f;
      //   celularA.espacoArmazenamento = 256;
      //   celularA.sistemaOperacional = "iOS";

      //   //  System.out.println(null);;
      //   // "Celular" + celularA.nome + "com tela de " + celularA.tela
      //   System.out.format("Celular %s com tela %.1f, com %d e SO %s \n", 
      //   celularA.nome, celularA.tela, celularA.espacoArmazenamento, celularA.sistemaOperacional);



      // Personagem heroi = new Personagem();
      // heroi.nome = "Capitão America";
      // heroi.nivel = 2;
      // heroi.forca = 16;

      // heroi.mostrarStatus();
      // heroi.atacar("Thanos");  
  

      Circulo circuloPequeno = new Circulo(2);
      double area = circuloPequeno.calcularArea();
      System.out.println(area);


      Quadrado quadradoPequeno = new Quadrado(5);
      double areaQuadrado = quadradoPequeno.calcularArea();
      System.out.println(areaQuadrado);

    }
}
