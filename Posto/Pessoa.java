public class Pessoa{
    
    private String nome;
    private String cpf;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }


    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    
    public toString(){
        String str = "";
        str += "Nome: " + this.nome +
            "\nCpf: " + this.cpf;
        return str;
    }

    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    
}