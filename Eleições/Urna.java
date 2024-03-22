import java.util.ArrayList;
import java.util.Scanner;


public class Urna {

    Scanner sc = new Scanner(System.in);

    ArrayList <Candidato> listaCandidatos = new ArrayList<>();

    public Urna(ArrayList<Candidato> listaCandidatos){
        this.listaCandidatos = listaCandidatos;
    }

    public void addCandidato(Candidato candidato){
        candidato.votos=0;
        this.listaCandidatos.add(candidato);
    }

    public void votar(Integer numeroCandidato){
        Boolean flag = false;
        while (true) {
            for(int i=0; i<listaCandidatos.size(); i++){
                if(numeroCandidato == listaCandidatos.get(i).numero){
                    listaCandidatos.get(i).votos++;
                    System.out.println("Voto computado!");
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
            System.out.println("Candidato não encontrado!\nInsira um número válido!");
            numeroCandidato = sc.nextInt();
        }
    }

    public void listarCandidatos(){
        for(int i=0; i<listaCandidatos.size(); i++){
            Candidato c=listaCandidatos.get(i);
            System.out.println();
            System.out.println("Candidato: "+c.nome);
            System.out.println("Número: "+c.numero);
            System.out.println("Cargo: "+c.cargo);
            System.out.println();
        }
    }

    public void listarVotos(){
        for(int i=0; i<listaCandidatos.size(); i++){
            Candidato c=listaCandidatos.get(i);
            System.out.println("Candidato "+c.nome+": "+c.votos+" votos.");
        }
    }



}
