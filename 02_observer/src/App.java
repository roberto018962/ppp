import corretora.CorretoraBitcoin;
import observadores.*;


public class App {

    public static void main(String[] args) {
        CorretoraBitcoin corretora = new CorretoraBitcoin();

        ClienteEmail cliente1 = new ClienteEmail("Roberto", "roberto@gmail.com");
        ClienteEmail cliente2 = new ClienteEmail("Ana", "ana@gmail.com");

        corretora.registrarCliente(cliente1);
        corretora.registrarCliente(cliente2);

        System.out.println("--- dia 1 ---");
        corretora.ajustaCotacao(150000.00);

        //adicionando um novo observador

        ClienteEmail cliente3 = new ClienteEmail("José", "jose@gmail.com");
        corretora.registrarCliente(cliente3);


        System.out.println("\n--- dia 2 ---");
        corretora.ajustaCotacao(165000.50);

        //removido um observador

        System.out.println("\n--- dia 3 ---");
        corretora.removerCliente(cliente1);
        corretora.ajustaCotacao(170000.00);

    }



}
