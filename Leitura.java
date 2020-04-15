/*
Esse programa eh um exemplo de como fazer uma estrutura de dados
vinda do teclado, um pequeno calculo e, finalmente, exibir o valor
final da tela
*/

import java.util.Scanner;

    public class Leitura{
        public static void main(String args[]){
            Scanner teclado;
            teclado = new Scanner (System.in);

            /* entrada de dados */
        
        int valor;
        System.out.print("Digite um número, por favor: ")
        valor =  teclado.nextInt();

            /* processamento */

        valor = valor * 100;

            /*  saida */ 

         System.out.print(" Novo valor " + valor);       

        }
}