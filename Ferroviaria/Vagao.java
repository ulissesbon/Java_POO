
public class Vagao {
    
    private Linha linhaFerroviaria;
    private int numSerie;
    private String tipo;
    private float capacidadeCarga;
    private float comprimentoTesteira;
    private float comprimentoEngates;

    Vagao(Linha linhaFerroviaria){
        this.linhaFerroviaria = linhaFerroviaria;
    }
    Vagao(Linha linhaFerroviaria, int numSerie){
        this.linhaFerroviaria = linhaFerroviaria;
        this.numSerie = numSerie;
    }
    Vagao(Linha linhaFerroviaria, int numSerie, String tipo){
        this.linhaFerroviaria = linhaFerroviaria;
        this.numSerie = numSerie;
        this.tipo = tipo;
    }
    Vagao(Linha linhaFerroviaria, int numSerie, String tipo, float capacidadeCarga){
        this.linhaFerroviaria = linhaFerroviaria;
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
    }
    Vagao(Linha linhaFerroviaria, int numSerie, String tipo, float capacidadeCarga, float comprimentoEngates){
        this.linhaFerroviaria = linhaFerroviaria;
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.comprimentoEngates = comprimentoEngates;
    }
    Vagao(Linha linhaFerroviaria, int numSerie, String tipo, float capacidadeCarga, float comprimentoEngates, float comprimentoTesteira){
        this.linhaFerroviaria = linhaFerroviaria;
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.comprimentoEngates = comprimentoEngates;
        this.comprimentoTesteira = comprimentoTesteira;
    }

    public Linha getLinhaFerroviaria() {
        return linhaFerroviaria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public int getNumSerie() {
        return numSerie;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setComprimentoEngates(float comprimentoEngates) {
        this.comprimentoEngates = comprimentoEngates;
    }
    public float getComprimentoEngates() {
        return comprimentoEngates;
    }

    public void setComprimentoTesteira(float comprimentoTesteira) {
        this.comprimentoTesteira = comprimentoTesteira;
    }
    public float getComprimentoTesteira() {
        return comprimentoTesteira;
    }

    public String toString(){
        String str = "";
        str += "Número de série: " + this.numSerie + 
        "\nTipo do vagão: " + this.tipo + 
        "\nCapacidade de carga: " + this.capacidadeCarga +
        "\nComprimento das testeiras: " + this.comprimentoTesteira +
        "\nComprimento dos engates: " + this.comprimentoEngates;
        return str;
    }


}
