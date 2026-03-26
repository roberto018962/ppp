package negocio;
abstract class Fertilizante {

    private float umidade = 0f;
    private float umidade_ideal;

    public final void produzir() {
        selecionar_materiais();
        dosificar();
        misturar();
        analisar_umidade();        
    }

    

    abstract void selecionar_materiais();


    private void analisar_umidade(){
        
        if (getUmidade() < umidade_ideal){

            System.out.println("Umidade insuficiente "+ this.getUmidade());
            umidecer();
            analisar_umidade();
                
        } else{    
    
        System.out.println("Umidade suficiente " + this.getUmidade());
        System.out.println("\n  Produção concluída\n");
        return;
        }

    };

    private void dosificar(){

        System.out.println("Separando as quantidades exatas...");
    };


    private void misturar(){

        System.out.println("Misturando...");
    
    };

     
    protected void umidecer(){

        System.out.println("Umidecendo a mistura ...");
        setUmidade(umidade+=0.05f);
    
    };

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

     public float getUmidade_ideal() {
        return umidade_ideal;
    }



    public void setUmidade_ideal(float umidade_ideal) {
        this.umidade_ideal = umidade_ideal;
    }

   

}