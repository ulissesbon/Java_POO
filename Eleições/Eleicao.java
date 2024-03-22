import java.util.ArrayList;
import java.util.Scanner;


public class Eleicao {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Candidato> listaCandidatos = new ArrayList<>();

        Urna u = new Urna(listaCandidatos);

        Candidato c1 = new Candidato("Ajalmar", 45, "Presidente");
        Candidato c2 = new Candidato("Pedro", 13, "Presidente");
        Candidato c3 = new Candidato("Nivardo", 24, "Presidente");

        u.addCandidato(c1);
        u.addCandidato(c2);
        u.addCandidato(c3);

        System.out.println("################################\n\n");
        System.out.println("Urna iniciada.\n\n");
        System.out.println("################################\n\n");

        String op = new String();
        


        Boolean flag = true;
        while(flag){

            System.out.println("Digite uma das opções:");
            System.out.println("a) Listar Candidatos;");
            System.out.println("b) Contagem de votos;");
            System.out.println("c) Votar;");
            System.out.println("d) Finalizar.");

            op = sc.nextLine();
            switch(op){
                case "a":
                    System.out.println("Listagem de Candidatos:");
                    u.listarCandidatos();
                    System.out.println("\n\n");
                    break;

                case "b":
                    System.out.println("Contagem de votos:");
                    u.listarVotos();
                    System.out.println("\n\n");
                    break;

                case "c":
                    System.out.println("Votar:");
                    Integer n = 0;
                    n = sc.nextInt();
                    u.votar(n);
                    System.out.println("\n\n");
                    break;

                case "d":
                    System.out.println("\n\n");
                    System.out.println("################################\n\n");
                    u.finalizarUrna();
                    System.out.println("Urna finalizada.\n\n");
                    System.out.println("################################\n\n");
                    flag=false;
                    break;
            
                default:
                    System.out.println("Digite uma opção válida!\n");
            }
        }



        sc.close();

    }
}
