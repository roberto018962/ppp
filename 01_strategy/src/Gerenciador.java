import estrategias.Recuperacao;

public class Gerenciador {
private Recuperacao estrategia;

    public void escolheEstrategia (Recuperacao estrategia) {

        this.estrategia = estrategia;
    }

    public void recuperar (String contato, String codigo) {

        if (estrategia == null) {

            System.out.println("Método de recuperação não selecionado");
            return;
        }
        estrategia.enviarCodigo(contato, codigo);
    }
}
