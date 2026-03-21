package observadores;

public class ClienteEmail implements Observer{

    private String nome;
    private String email;

    public ClienteEmail(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public void atualizar(double cotacao) {
        System.out.println("Enviando email...");
        System.out.println("Para: " + email);
        System.out.println("Olá " + nome + ", o Biticoin está valendo hoje R$" + cotacao);
        System.out.println("Att. Sua Corretora\n");
    };

}
