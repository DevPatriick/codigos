package classes;

public class Circulo implements FiguraGeometrica{
   
   private int raio;

     // constructor 
     public Circulo(int raio){
        this.raio = raio;
     }

     @Override
public double calcularArea() {
    double area = Math.PI * Math.pow(raio, 2);
    return area;
   
}


// métodos especificos da classe
// public double calcularArea(){
//     // area = PI * raio ^2

//     double area = Math.PI * Math.pow(raio, 2);
//     return area;
// }


// metodos getters e setters 
public int getRaio() {
    return raio;
}

public void setRaio(int raio){
    this.raio = raio;
}






}



