import java.util.Scanner;

public class TestaAr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArCondicionado ac1 = new ArCondicionado();

        ac1.setNome("Fujitsu - LMC3");
        ac1.setTempMax(28.0f);
        ac1.setTempMin(16.0f);
        ac1.setTempAmbiente(24.0f);
        ac1.setTempAtual();

        int op;

        do{
            System.out.println("Ligar o ar?");
            System.out.println("(1) Sim;\n(2)Não.");
            op=sc.nextInt();
            if(op==1){
                ac1.togglerPower();
                System.out.println("Ar-condicionado ligado!");
                break;
            }
            else if(op==0)
                System.out.println("Ar desligado!");


        }while(op!=0 || op!=1);

        
        do{
            
            System.out.println("Escolha umas das opções a seguir:");
            System.out.println("Temperatura atual: "+ac1.getTempAtual()+";");
            System.out.println("Temperatura ambiente: "+ac1.getTempAmbiente()+";");
            System.out.println("1- Escolher temperatura;");
            System.out.println("2- Temperatura máxima;");
            System.out.println("3- Temperatura mínima;");
            System.out.println("4- Atualizar temperatura ambiente;");
            System.out.println("0- Desligar.");
            ac1.funcionando();

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite a temperatura desejada:");
                    Integer temp = sc.nextInt();
                    ac1.setTempAtual(temp);
                    ac1.funcionando();
                    break;

                case 2:
                    System.out.println("Temperatura máxima do dispositivo: "+ac1.getTempMax());
                    break;

                case 3:
                    System.out.println("Temperatura mínima do dispositivo: "+ac1.getTempMin());
                    break;

                case 4:
                    System.out.println("Temperatura ambiente: "+ac1.getTempAmbiente());
                    break;
                
                case 0:
                    System.out.println("Ar-condicionado desligado!");
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
            
        }while (op!=0);

        sc.close();
    }
    
}
