/*
Esse programa eh um exemplo de como fazer uma estrutura de dados
vinda do teclado, um pequeno calculo e, finalmente, exibir o valor
final da tela
*/

import util.java.Scanner;

    public class Leitura_1{
        public static void main (String args []){
            Scanner teclado;
            teclado = new Scanner (System.in);

            /* entrada de dados */

            int valor;
            System.out.print("Digite um valor por favor ");
            valor = teclado.nextIn();

            /* processamento */

            valor = valor*100;

            /* saida */

            System.out.println("O valor é "+valor)



        }
    }
