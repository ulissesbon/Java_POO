import java.util.Scanner;

public class Participante extends Usuario{

    // Participante herda os dados de usuário
    Participante(String nome, String email, String senha){
        super(nome, email, senha);
    }

    private int numero;
    private double tempo;
    private Grupo grupo;
    private Evento evento;
    private String camisa;
    private Percurso percurso;



    Scanner sc = new Scanner(System.in);

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    public double getTempo() {
        return this.tempo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    public Grupo getGrupo() {
        return grupo;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public Evento getEvento() {
        return this.evento;
    }

    public void setCamisa(String camisa) {
        this.camisa = camisa;
    }
    public String getCamisa() {
        return camisa;
    }
    
    public void setPercurso(Percurso percurso) {
        this.percurso = percurso;
    }
    public Percurso getPercurso() {
        return this.percurso;
    }

    // Nesse método, um grupo já criado receberá um nome
    public void criarGrupo(Grupo grupo, String nomeGrupo){
        setGrupo(grupo);
        grupo.setNomeGrupo(nomeGrupo);
    }

    // Nesse método um novo grupo será criado
    public void criarGrupo(String nomeGrupo){
        setGrupo(grupo);
        this.grupo = new Grupo(nomeGrupo);
    }



    public String toString(){
        String str = "";
        str += "\nNome do partipante: " + this.getNome() +
                "\nNúmero: " + this.numero + 
                "\nTempo: " + this.tempo +
                "h\nEvento: " + this.evento.getNomeEvento() +
                "\n" + this.percurso.toString();
        return str;
    }

}
