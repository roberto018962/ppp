public class Botao {
    private Comando comando;
    public void setComando(Comando c) { 
        this.comando = c; 
    }
    
    public void apertar() {
        comando.executar();
    }
}