public class ComandoCopiar implements Comando {
    private Editor editor;
    
    
    public ComandoCopiar(Editor editor) { 
        this.editor = editor; 
    }
    
    @Override
    public void executar() {
        editor.copiar();
    }
}