import java.util.Scanner;
import java.util.Random;

public class Matriz {
    int mat[][];
    int transpo[][];
    int x, y;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public void Inicializar(int a, int b){
        this.x=a;
        this.y=b;
        this.mat = new int[x][y];
        System.out.println("Matriz inicializada!");
        System.out.println("Digite os valores da matriz:");
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                mat[i][j] = random.nextInt(100);
            }
        }
        System.out.println();
    }

    public void Imprimir(){
        System.out.println("Matriz[x][y]:");
        for(int i=0; i<x; i++){
            System.out.println("");
            for(int j=0; j<y; j++){
                System.out.print(mat[i][j]+"\t");
            }
        }
        System.out.println();
    }

    public void Transp(){
        this.transpo=new int[y][x];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                transpo[j][i]=mat[i][j];
            }
        }
        System.out.println("Matriz transposta:");

        for(int i=0; i<y; i++){
            System.out.println("");
            for(int j=0; j<x; j++){
                System.out.print(transpo[i][j]+"\t");
            }
        }
        System.out.println();

    }

    public void DiagonalSecundaria(){
        if(x!=y)
            System.out.println("Matriz sem diagonal secundária!");
        else{
            System.out.println("Diagonal secundária:");
            for(int i=0; i<x; i++){
                System.out.println();
                for(int j=0; j<y; j++){
                    if(i+j==x-1){
                        System.out.println(mat[i][j]);
                    }
                    else
                        System.out.print("\t");
                }
            }
        }
        System.out.println();
    }
    
}
