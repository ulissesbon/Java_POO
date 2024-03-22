

public class Estacao {

    private String sigla;
    private String descricao;
    private Linha linhaFerroviaria[];

    Estacao(Linha[] linhaFerroviaria){
        this.linhaFerroviaria = linhaFerroviaria;
    }

    public Linha[] getLinha() {
        return linhaFerroviaria;
    }


    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getSigla() {
        return sigla;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    
    public String toString(){
        String str = "";
        str += "Sigla: " + this.sigla + 
        "\nDescrição: " + this.descricao;
        return str;
    }
    

}
