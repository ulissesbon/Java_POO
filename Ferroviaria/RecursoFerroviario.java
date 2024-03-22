
public class RecursoFerroviario {
    
    private Linha linhaFeroviaria;
    private Vagao vagao[];
    private Locomotiva locomotiva[];
    private Trem trem[];

    RecursoFerroviario(Linha linhaFerroviaria){
        this.linhaFeroviaria = linhaFeroviaria;
    }

    public Linha getLinhaFeroviaria() {
        return linhaFeroviaria;
    }

    public void setLocomotiva(Locomotiva[] locomotiva) {
        this.locomotiva = locomotiva;
    }
    public Locomotiva[] getLocomotiva() {
        return locomotiva;
    }


    public void setTrem(Trem[] trem) {
        this.trem = trem;
    }
    public Trem[] getTrem() {
        return this.trem;
    }

    
    public void setVagao(Vagao[] vagao) {
        this.vagao = vagao;
    }
    public Vagao[] getVagao() {
        return this.vagao;
    }

}
