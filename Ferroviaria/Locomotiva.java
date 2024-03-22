
public class Locomotiva {
    
    private Linha linhaFerroviaria;
    private int numSerie;
    private float tracao;
    private float comprimento;

    Locomotiva(Linha linhaFerroviaria){
        this.linhaFerroviaria = linhaFerroviaria;
    }

    Locomotiva(Linha linhaFerroviaria, int numSerie){
        this.linhaFerroviaria = linhaFerroviaria;
        this.numSerie = numSerie;
    }

    Locomotiva(Linha linhaFerroviaria, int numSerie, float tracao){
        this.linhaFerroviaria = linhaFerroviaria;
        this.numSerie = numSerie;
        this.tracao = tracao;
    }

    Locomotiva(Linha linhaFerroviaria, int numSerie, float tracao, float comprimento){
        this.linhaFerroviaria = linhaFerroviaria;
        this.numSerie = numSerie;
        this.tracao = tracao;
        this.comprimento = comprimento;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public int getNumSerie() {
        return numSerie;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    public float getComprimento() {
        return comprimento;
    }

    public void setTracao(float tracao) {
        this.tracao = tracao;
    }
    public float getTracao() {
        return tracao;
    }

    public Linha getLinhaFerroviaria() {
        return linhaFerroviaria;
    }


    public String toString(){
        String str = "";
        str += "Serial: " + this.numSerie + 
        "\nComprimento: " + this.comprimento + 
        "\nTração: " + this.tracao;
        return str;
    }

}
