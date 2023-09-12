package variaveis;

public class Switch {
    
    int opcoes = 0;

    switch (opcoes) {
        case 1:
            System.out.println("Abra sua conta");
            break;

        case 2:
            System.out.println("Fatura de cartão");
             break;

        case 3:
            System.out.println("Crédito imobiliario");
            break;
    
        default:
            System.out.println("escolha uma opção valida");
            break;
    }
}
