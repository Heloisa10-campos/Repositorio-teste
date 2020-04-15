/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo 
em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem 
“Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
*/

import java.util.Scanner;
    public class URI3037{
        public static void main (String args[]){
            Scanner teclado = new Scanner (System.in);
            int numero;

            System.out.print("Digite um numero por favor: ");
            numero = teclado.nextInt();
            
            if (numero >= 0 && numero <= 25){
                System.out.print("Seu numero eh maior que 0 e menor que 25 "+numero);

            }
            else if (numero > 25 && numero <= 50){
                System.out.print("Seu numero eh maior que 25 e menor que 50 "+numero);
            }
            else if (numero > 50 && numero <= 75){
                System.out.print("Seu numero eh maior que 25 e menor que 50 "+numero);
            }
            else if (numero > 75 && numero <= 100){
                System.out.print("Seu numero eh maior que 25 e menor que 50 "+numero);
            }
            else{
                System.out.print("Seu numero esta fora od intervalo "+numero);
            }


        }


    }