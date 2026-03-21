class Npk extends Fertilizante{

    float umidade_ideal;

    public Npk() {
        
        this.setUmidade_ideal(0.2f);

    }

    @Override
    void selecionar_materiais() {
        System.out.println("Produção de NPK iniciada\nSelecionando Nitrogênio, Fósforo e Potássio...");
    }


    
}
