package negocio;

public class Npk extends Fertilizante{

    public Npk() {
        
        this.setUmidade_ideal(0.2f);

    }

    @Override
    void selecionar_materiais() {
        System.out.println("Produção de NPK iniciada\nSelecionando Nitrogênio, Fósforo e Potássio...");
    }


    
}
