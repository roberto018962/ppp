public class Supersimples extends Fertilizante{

    public Supersimples() {

        this.setUmidade_ideal( 0.15f);
    }


    @Override
    void selecionar_materiais() {
        System.out.println("Produção de Super Simples iniciada\nSelecionando Cálcio, Fósforo e Enxofre...");
    }

     
}
