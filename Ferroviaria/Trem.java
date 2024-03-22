
import java.util.Date;

public class Trem {
    
    private Linha linhaFerroviaria;
    private Vagao[] vagoes;
    private Locomotiva[] locomotivas;
    private String prefixo;
    private Date dataFormacao;
    private Estacao estacaoOrigem;
    private Estacao estacaoDestino;

    Trem(Linha linhaFerroviaria, Vagao[] vagoes, Locomotiva[] locomotivas, Estacao estacaoOrigem, Estacao estacaoDestino){
        this.linhaFerroviaria = linhaFerroviaria;
        this.vagoes = vagoes;
        this.locomotivas = locomotivas;
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;
    }

    public void setDataFormacao(Date dataFormacao) {
        this.dataFormacao = dataFormacao;
    }
    public Date getDataFormacao() {
        return dataFormacao;
    }

    public Estacao getEstacaoDestino() {
        return estacaoDestino;
    }
    public Estacao getEstacaoOrigem() {
        return estacaoOrigem;
    }
    public Linha getLinhaFerroviaria() {
        return linhaFerroviaria;
    }
    public Locomotiva[] getLocomotivas() {
        return locomotivas;
    }
    public String getPrefixo() {
        return prefixo;
    }
    public Vagao[] getVagoes() {
        return vagoes;
    }

    public String toString(){
        String str = "";
        str += "Prefixo do trem: " + this.prefixo + 
        "\nData de Formação: " + this.dataFormacao +
        "\nEstação de origem: " + this.estacaoOrigem +
         "\nEstação de destino: " + this.estacaoDestino;
        return str;
    }

}
