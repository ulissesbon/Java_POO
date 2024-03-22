
public class Linha {

    private RecursoFerroviario recursos[];
    private int numero;
    private String descricao;
    private float extensao;

    public void setRecursos(RecursoFerroviario[] recursos) {
        this.recursos = recursos;
    }
    public RecursoFerroviario[] getRecursos() {
        return recursos;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }


    public void setExtensao(float extensao) {
        this.extensao = extensao;
    }
    public float getExtensao() {
        return extensao;
    }
    

    public String toString(){
        String str = "";
        str += "Número da linha: " + this.numero + 
        "\nExtensão: " + this.extensao +"km"+ 
        "\nDescrição: " + this.descricao +
        "\nQuantidade de recursos ferroviários: " + this.recursos.length;
        return str;
    }
    

}
