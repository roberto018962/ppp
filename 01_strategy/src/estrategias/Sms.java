package estrategias;

public class Sms implements Recuperacao {

    @Override
    public void enviarCodigo (String contato, String codigo){
        System.out.println("Enviando SMS para " + contato + ", seu código é" + codigo);
    }
}