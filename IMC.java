import java.util.Scanner;
    public class IMC{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int pesoH, pesoM, altura, sexo;

            System.out.print("Digite sua altura: ");
            altura = teclado.nextInt();

            System.out.print("Digite seu sexo: ");
            sexo = teclado.nextInt();

            pesoH = (727/10 * altura) - 58;
            pesoM = (621/10 * altura) - 447/10;

            if (sexo = homem){
                System.out.print("Seu peso ideal é: "+pesoH);
            }
            else{
                System.out.print("Seu peso ideal é: "+pesoM);
            }
        }
    }