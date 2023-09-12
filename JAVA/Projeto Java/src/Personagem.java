public class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus(){
        System.out.format("Personagem: %s (lvl %d) com %d de força \n", nome, nivel, forca);
    }

    void atacar(String alvo){
        System.out.format("%s atacou %s e causou %d de dano \n", nome, alvo, forca);

    }
}
