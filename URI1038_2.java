/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à 
quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, 
com 2 casas após o ponto decimal.
*/

import java.util.Scanner;
public class URI1038_2{
    public static void main(String args[]){
     Scanner teclado = new Scanner(System.in);
        int codigo, quantidade;
        float valorConta;

        System.out.print("Digite o codigo do produto: ");
        codigo = teclado.nextInt();
        System.out.print("Digite a quantidade de produtos: ");
        quantidade = teclado.nextInt();

        
        if (codigo == 1){
            valorConta = quantidade * 4;
            System.out.print("Total: R$ "+valorConta);

        }
        else if (codigo == 2){
            valorConta = quantidade * 4.5f;
            System.out.print("Total: R$ "+valorConta);
        }
        else if (codigo == 3){
            valorConta = quantidade * 5;
            System.out.print("Total: R$ "+valorConta);
        }
        else if (codigo == 4){
            valorConta = quantidade * 2;
            System.out.print("Total: R$ "+valorConta);
        }
        else if (codigo ==5){
            valorConta = quantidade * 1.5f;
            System.out.print("Total: R$ "+valorConta);
        }

    }
}


