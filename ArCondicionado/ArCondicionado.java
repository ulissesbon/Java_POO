public class ArCondicionado {

    private String nome;
    private Integer tempAtual;
    private Float tempAmbiente;
    private Float tempMax;
    private Float tempMin;
    private Boolean power = false;


    public void togglerPower(){
        this.power = !this.power;

        if(this.power)
            System.out.println("O ar-condicionado está ligado!");
        else
            System.out.println("O ar-condicionado está desligado!");
    }



    public void setTempAmbiente(){
        this.tempAmbiente = 25.0f;
    }
    public void setTempAmbiente(Float tempAmbiente){
        this.tempAmbiente = tempAmbiente;
    }
    public Float getTempAmbiente(){
        return this.tempAmbiente;
    }



    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }


    public void funcionando(){
        while(this.tempAmbiente!=this.tempAtual.floatValue()){
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            if(this.tempAmbiente<this.tempAtual){
                tempAmbiente+=0.5f;
            }
            else if(this.tempAmbiente<this.tempAtual){
                tempAmbiente-=0.5f;
            }
            else if(this.tempAmbiente-this.tempAtual<0.5f){
                this.tempAmbiente=this.tempAtual.floatValue();
            }
            else
                break;
        }
    }


    public void setTempAtual(){
        this.tempAtual = 23;
    }
    public void setTempAtual(Integer tempAtual){
        Boolean op = true;;
        while (op) {
            if(this.tempAtual>this.tempMax || this.tempAtual<this.tempMin){
                System.out.println("Erro! Temperatura fora dos limites da máquina!");
            }
            else{
                this.tempAtual = tempAtual;
                op = false; 
            }
        }
    }
    public Integer getTempAtual(){
        return this.tempAtual;
    }



    public void setTempMax(Float tempMax){
        this.tempMax = tempMax;
    }
    public Float getTempMax(){
        return this.tempMax;
    }



    public void setTempMin(Float tempMin){
        this.tempMin = tempMin;
    }
    public Float getTempMin(){
        return this.tempMin;
    }
    
}
