public class Veiculo{
    private String placa;
    private int potencia;
    private Pessoa proprietario;

    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca() {
        return this.placa;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public int getPotencia(){
        return this.potencia;
    }

    public void setPropietario(Pessoa proprietario){
        this.proprietario = proprietario;
    }
    public Pessoa getProprietario(){
        return this.proprietario;
    }


    Veiculo(String placa, int potencia){
        this.placa = placa;
        this.potencia = potencia;
    }
    Veiculo(String placa, int potencia, Pessoa proprietario){
        this.placa = placa;
        this.potencia = potencia;
        this.proprietario = proprietario;
    }


    
    
}