import java.util.Scanner;
    public class 1006{
        public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner (System.in);
        float nota_A, nota_B, nota_C, media;

        System.out.print("Digite sua 1º nota: ");
        nota_A = teclado.nextFloat();

        System.out.print("Digite sua 2º nota: ");
        nota_B = teclado.nextFloat();

        System.out.print("Digite sua 3º nota: ");
        nota_C = teclado.nextFloat();

        media = (nota_A * 20/100)+ (nota_B * 30/100) + (nota_C * 50/100);

        System.out.printf("A média das notas será: %10.2f\n"+media)


        }
    }