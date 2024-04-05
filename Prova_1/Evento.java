import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Evento {

    private String nomeEvento;
    private String data;
    private int limiteParticipantes;
    private int qntInscritos;
    private Percurso[] percursos;
    private ArrayList<Participante> ranking = new ArrayList<Participante>();
    private ArrayList<Participante> participantes = new ArrayList<Participante>();
    private ArrayList<Grupo> grupos = new ArrayList<Grupo>();
    private String kitEvento;
    private Organizador organizador;

    Scanner sc = new Scanner(System.in);

    // Construtor em que o evento já tem seu organizador passado na inicializaçõa
    Evento(Organizador organizador, String nomeEvento, String data, int limiteParticipantes, String kitEvento){
        setOrganizador(organizador);
        setNomeEvento(nomeEvento);
        setData(data);
        setLimiteParticipantes(limiteParticipantes);
        setKitEvento(kitEvento);
        qntInscritos = 0;
    }

    // Construtor onde o organizador ainda não foi definido
    Evento(String nomeEvento, String data, int limiteParticipantes, String kitEvento){
        setNomeEvento(nomeEvento);
        setData(data);
        setLimiteParticipantes(limiteParticipantes);
        setKitEvento(kitEvento);
        qntInscritos = 0;
    }

    

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    public String getNomeEvento() {
        return this.nomeEvento;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return this.data;
    }

    public void setLimiteParticipantes(int limiteParticipantes) {
        this.limiteParticipantes = limiteParticipantes;
    }
    public int getLimiteParticipantes() {
        return this.limiteParticipantes;
    }

    public void setPercursos(Percurso[] percursos) {
        this.percursos = percursos;
    }
    public Percurso[] getPercursos() {
        return this.percursos;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.ranking = participantes;
    }
    public ArrayList<Participante> getParticipantes() {
        return this.ranking;
    }

    public void setKitEvento(String kitEvento) {
        this.kitEvento = kitEvento;
    }
    public String getKitEvento() {
        return this.kitEvento;
    }
    
    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }
    public Organizador getOrganizador() {
        return this.organizador;
    }

    public void setNumInscricao(int numInscricao) {
        this.qntInscritos = numInscricao;
    }
    public int getNumInscricao() {
        return this.qntInscritos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }
    public ArrayList<Grupo> getGrupos() {
        return this.grupos;
    }

    // A fim de exemplificar, os participantes recebem seu tempo de prova aleatoriamente
    public void definirTempo(Participante participante){
        Random random = new Random();
        participante.setTempo(Math.round((random.nextDouble() * 3 + 1) * 1000.0)/1000.0);
        
    }

    /* Para adicionar, será visto se ultrapassa o limite de participantes declarado na inicialização do
        evento, e, afim de exemplos para serem vistos, o tempo dos participantes é colocado nessa parte */
    public void addParticipante(Participante participantes){
        if(this.participantes.size() < this.limiteParticipantes){
            ++this.qntInscritos;
            participantes.setNumero(this.qntInscritos);
            this.participantes.add(participantes);
            definirTempo(participantes);
        }
        else    
            System.out.println("Limite de participantes atingido!");
    }

    // Para se inscrever o participante escolhe seu tamanho de camisa e o percurso que quer participar
    public void inscrever(Participante participante, String camisa, Percurso percurso){
        addParticipante(participante);
        participante.setCamisa(camisa);
        participante.setPercurso(percurso);
        participante.setEvento(this);
    }

    // O ranking colherá todos os participantes e analiza seus tempos de corrida e os ordena
    public void getRanking(){
        this.ranking.addAll(this.participantes);
        for (int i = 0; i < this.ranking.size() ; i++) {
            for (int j = 0; j < this.ranking.size() - i -1 ; j++) {
                if(ranking.get(j).getTempo() > ranking.get( j + 1).getTempo()){
                    Participante aux = ranking.get(j);
                    ranking.set(j, ranking.get(j+1));
                    ranking.set(j+1, aux);
                }
            }
            
        }
    }

    // O ranking como string passará apenas o pódium da corrida
    public String rankingToString(){
        String str = "";
        getRanking();
        for (int i = 0; i < 3; i++) {
            str += ranking.get(i).getNome() + " ______________ Tempo: " + ranking.get(i).getTempo() + "h\n";
        }
        return str;
    }

    // A fim de exemplificação o toString do evento mostrará o pódium, além de outros dados do evento
    public String toString(){
        String str = "";
        str += "Evento: " + this.nomeEvento +
                "\nData: " + this.data + 
                "\nLimite de participantes: " + this.limiteParticipantes +
                "\nNúmero de participantes: " + this.participantes.size() + 
                "\nKit: " + kitEvento.toString() +
                "\nOrganizador: " + this.organizador.getNome() +
                "\nRanking:\n" + rankingToString();
        return str;
    }

    

}
