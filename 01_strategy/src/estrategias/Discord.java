package estrategias;

public class Discord implements Recuperacao {

  
    @Override
    public void enviarCodigo(String contato, String codigo) {
        System.out.println("Enviando mensagem no Discord para " + contato + ", seu código é " + codigo);
    }
}
