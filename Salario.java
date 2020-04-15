/*
Voce foi contratado/a para fazer o calculo do salario de um novo
colaborador do time de DEVs
O calculo eh estipulado da seguinte maneira:
dado o salario, o imposto eh fixo: 15%
voce deve informar o salario que foi digitado, o imposto que foi
calculado e o salario liquido no final
    - Meu programa sabe quanto vale o salario do funcionario?
         NAO - preciso informa-lo (Entrada de Dados)
    - Sei como calcular o imposto? 
         SIM - para isso vamos precisar do valor do salario e tambem
               armazenar esse imposto calculado
    - Sei como calcular o salario liquido?
         SIM - a partir do valor do salario original e do imposto calculado,
               conseguimos subtrair esse valor e ter o salario liquido
    Como fica entao??
    Passo 1: Sabe quanto vale o salario
    Passo 2: Calcular o imposto que eh de 15%
    Passo 3: subtrair o valor do Passo 1 do valor do Passo 2
    Passo 4: Exibir tudo na tela     
*/

import util.java.Scanner;

    public class Salario{
        public static void main (String args[]){      
        Scanner teclado;
        teclado = new Scanner (System.in);
        float salario, imposto, sal_liq;

        /* entrada */
        System.out.printf("Qual o valor de seu salário: "+)
        salario = teclado.nextFloat();

        /* processamento */
        imposto = salario * 15/100;
        sal_liq = salario - imposto;

        /* saida */
        System.out.printf("O valor do imposto eh: %10.2f\n"+imposto);
        System.out.printf("O valor do salario líquido eh: %10.2f\n"+sal_liq);

        }
    }