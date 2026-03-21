package estrategias;

public class Email implements Recuperacao {

    @Override
    public void enviarCodigo (String contato, String codigo){
        System.out.println("Enviando e-mail para " + contato + ", seu código é " + codigo);
    }

}