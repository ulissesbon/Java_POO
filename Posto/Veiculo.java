public class Veiculo{

    private String placa;
    private int potencia;
    private Pessoa proprietario;
    private Tanque tanque;

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

    public void acelerar(){
        float gasto = this.potencia/10f;
        if((this.tanque.getStatus()) < gasto){
            System.out.println("Sem gasolina suficiente!");
        }
        else{
            this.tanque += gasto;
            setStatus(this.tanque);
            System.out.println("Acelerando!");
        }
    }

    public String toString(){
        String str = "";
        str += "Propietário: " + getProprietario()
                "\nPotência do veículo: " + this.potencia +
                "CV\nPlaca do veículo: " + this.placa;
        return str;
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