/*
Faça um algoritmo que leia a idade de uma pessoa e informe sua categoria
eleitoral, segundo a seguinte tabela:
não eleitores menores de 16 anos de idade
obrigatórios entre 18 e 65 anos
facultativos entre 16 e 18 e maiores de 65 anos
*/

import java.util.Scanner;
public class CategoriaEleitoral{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int idade;

        idade = teclado.nextInt();

        if (idade < 16){
            System.out.print("Não eleitores");
        }
        else if (ideda >= 18 && idade <= 65){
            System.out.print("Eleitrores obrigatórios");

        }
        else {
            System.out.print("Eleitores facultativos0");
        }

    }

}



