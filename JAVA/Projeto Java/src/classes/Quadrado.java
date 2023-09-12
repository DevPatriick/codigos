package classes;

public class Quadrado implements FiguraGeometrica{
    private int lado;

    // constructor
    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    // metodos da classe
    // public double gerarArea(){
      
    // }



    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

   

    
}
