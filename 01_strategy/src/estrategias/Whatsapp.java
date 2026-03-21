package estrategias;

    public class Whatsapp implements Recuperacao {
    @Override
    public void enviarCodigo(String contato, String codigo) {
        System.out.println("Enviando mensagem no WhatsApp para " + contato + ", seu código é " + codigo);
    }
}
