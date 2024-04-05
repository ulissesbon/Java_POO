import java.util.ArrayList;

public class Grupo {

    private String nomeGrupo;
    private ArrayList<Participante> participantes = new ArrayList<Participante>();


    // Ao criar o grupo, o usuário deverá dizer qual nome deseja colocar
    Grupo(String nomeGrupo){
        setNomeGrupo(nomeGrupo);
    }
    // Construtor vazio para caso o grupo não tenha um nome definido ainda
    Grupo(){
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }
    public String getNomeGrupo() {
        return nomeGrupo;
    }
    
    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }
    public ArrayList<Participante> getParticipantes() {
        return this.participantes;
    }

    // Cada participante do grupo deve ser adicionado para o grupo
    public void addParticipante(Participante participantes){
        this.participantes.add(participantes);
    }

    public String toString(){
        String str = "";
        str += "Nome do grupo: " + this.nomeGrupo +
                "\n" + this.participantes.toString();
        return str;
    }

    
}
