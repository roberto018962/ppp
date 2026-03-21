public class Main {
    public static void main(String[] args) {
       
        Editor meuEditor = new Editor();

        
        Comando acaoCopiar = new ComandoCopiar(meuEditor);
        Comando acaoColar = new ComandoColar(meuEditor);

        
        Botao botaoCopiar = new Botao();
        Botao botaoColar = new Botao();

        botaoCopiar.setComando(acaoCopiar);
        botaoColar.setComando(acaoColar);

        System.out.println("--- Usuário clica no botão de copiar ---");
        botaoCopiar.apertar();

        System.out.println("\n--- Usuário clica no botão de colar ---");
        botaoColar.apertar();
        
        System.out.println("\n--- Trocando a função do botão de copiar para colar ---");
        botaoCopiar.setComando(acaoColar);
        botaoCopiar.apertar();
    }
}