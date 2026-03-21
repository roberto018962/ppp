import estrategias.*;

public class App {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();
        String codigoGerado = "A1B2C3";


    // por email

    gerenciador.escolheEstrategia(new Email());
    gerenciador.recuperar("usuario@esquecido.com", codigoGerado);

    // por whats

    gerenciador.escolheEstrategia(new Whatsapp());
    gerenciador.recuperar("+55 53 99919-9999", codigoGerado);

    // por sms


    gerenciador.escolheEstrategia(new Sms());
    gerenciador.recuperar("+55 53 99919-9999", codigoGerado);

    // por discord

    gerenciador.escolheEstrategia(new Discord());
    gerenciador.recuperar("123123123123123", codigoGerado);


    }

}