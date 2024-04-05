import java.util.ArrayList;

public class Bomba{
    
    private ArrayList <Operacao> operacoes = new ArrayList<Operacao>();


    public void setOperacoes(ArrayList<Operacao> operacoes){
        this.operacoes = operacoes;
    }
    public ArrayList<Operacao> getOperacoes(){
        return operacoes;
    }

    public void addOperacao(Operacao operacao){
        operacoes.add(operacao);
        System.out.println("Adicionado com sucesso!");
    }

    public void getNumOp(){
        System.out.println("Número de operações: " + operacoes.size());
    }

}