import java.util.Scanner;
public class URI1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N;
        N = teclado.nextInt();

        for (;N>0;N--){
            //System.out.print("deu certo");
            if(N == 0){
                System.out.println("Null");
            }
            else if (N % 2 ==0 && N>0){
                System.out.println("EVEN POSITIVE");
            }
            else if (N % 2 ==0 && N<0){
                System.out.println("EVEN NEGATIVE");
            }
            else if (N % 2 !=0 && N>0){
                System.out.println("ODD POSITIVE");
            }
            else if (N % 2 !=0 && N>0){
                System.out.println("ODD NEGATIVE");
            }         
        }
    }
}



        /*do{
            System.out.print("Digite a qunatidade de números a serem lidos: ")

        } while 
        */

    }
}