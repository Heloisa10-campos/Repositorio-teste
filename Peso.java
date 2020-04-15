/*
Segundo uma tabela médica, o peso ideal está relacionado com ma altura e o sexo
de uma pessoa. Faça um programa que recebe a altura e o sexo de uma pessoa,
calcule e imprima seu peso ideal, segundo as fórmulas:
 homens : (72.7 * H) – 58
 mulheres : (62.1 * H) – 44,7 
 */

import java.util.Scanner;
public class PESO_2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int sexo;
        float peso, altura;

        System.out.print("Digite sua altura: ");
        altura = teclado.nextFloat();

        System.out.print("Digite seu sexo 1 para homem, 2 para mulheres: ");
        sexo = teclado.nextInt();

        if (sexo == 1){
            peso = 72.7f * altura - 58;
            System.out.print("Seu peso ideal eh: "+peso);
        }
        else{
            peso = 62.1f * altura - 44.7f;
            System.out.print("Seu peso ideal eh: "+peso); 
        }
    }

}