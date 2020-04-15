/*
    DDMMAAAA
    ano???
    13042020 / 10000
        2020    1304
         +---------------> ano
    
    1304 / 100
      04    13  ---------> dia
       +-----------------> mes
 */

import util.java.Scanner;

    public class CapturaData{
        public static void main (String args[]){
            Scanner teclado = new Scanner(System.in);
            int data, mes, dia, ano;

            System.out.print("Digite sua data: ")
            data = teclado.next.Int();

            ano = data % 1000;
            res = data /1000;

            dia = res / 100
            mes = res % 100

            System.out.println("O dia é "+dia);
            System.out.println("O mes é "+mes);
            System.out.println("O ano é "+ano);


        }

    }