import java.util.Scanner;
    public class 1018{
        public static void main(String args []){
            
        /*Entrada
        
        Processamento?

        Saida: valor lido, q100, q50, q20, q10, q5, q2, q1;
        
        */
            int valorSaque;
            int valorLido, q100, q50, q20, q10, q5, q2, q1;

            Scanner teclado = new Scanner(System.in);

            //Entrada
            valorSaque = teclado.nextInt();
            valorLido = valorSaque; // para exibir no final

            q100 = valorSaque /100
            valorSaque = valorSaque % 100; // valorSaque = valorSaque - q100 *100

            q50 = valorSaque /50;
            valorSaque = valorSaque % 50; // valorSaque = valorSaque - q50 *50

            q20 = valorSaque /20;
            valorSaque = valorSaque % 20;

            q10 = valorSaque /10;
            valorSaque = valorSaque % 10; 

            q5 = valorSaque /5;
            valorSaque = valorSaque % 5; 

            q2 = valorSaque /2;
            q1 = valorSaque %2;             // ultimoCaso: valorSaque = valorSaque - q2 *2

            System.out.println(q100 + "nota(s) de R$ 100,00");
            System.out.println(q100 + "nota(s) de R$ 50,00");
            System.out.println(q100 + "nota(s) de R$ 20,00");
            System.out.println(q100 + "nota(s) de R$ 10,00");
            System.out.println(q100 + "nota(s) de R$ 5,00");
            System.out.println(q100 + "nota(s) de R$ 2,00");
            System.out.println(q100 + "nota(s) de R$ 1,00");

        }
    }