public class Candidato{

    private String nome;
    private Integer numero;
    private String cargo;
    private Integer votos;

    Candidato(String nome, Integer numero, String cargo){
        this.nome = nome;
        this.numero = numero;
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }
    public String getNome() {
        return this.nome;
    }
    public Integer getNumero() {
        return this.numero;
    }
    public void initVotos(){
        this.votos = 0;
    }
    public void setVotos(){
        this.votos++;
    }
    public Integer getVotos() {
        return this.votos;
    }
    
    
}
