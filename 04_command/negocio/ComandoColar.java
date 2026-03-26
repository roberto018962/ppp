package negocio;

public class ComandoColar implements Comando {
    private Editor editor;
    public ComandoColar(Editor editor) { 
        
        this.editor = editor; 
    
    }

    @Override
    public void executar() {
        editor.colar();
    }
}