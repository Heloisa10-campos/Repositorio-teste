/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em 
pagar seus impostos, pois sabem que nele não existem políticos corruptos e os 
recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. 
A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, 
segundo a tabela abaixo.

Lembre que, se o salário for R3002.00,ataxaqueincideéde8 1000.00, 
pois a faixa de salário que fica de R0.00atéR 2000.00 é isenta de Imposto de Renda. 
No exemplo fornecido (abaixo), a taxa é de 8% sobre R1000.00+18 2.00, o que resulta
 em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
*/

import java.util.Scanner;
public class URI1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float salario, renda, importo;
        
        System.out.print("Digite sua renda: ");
        salario = teclado.nextFloat();

        renda = salario - 2000.00f;

        if(renda <=0){
            System.out.print("Isento");

        }
        else if (renda >0 && renda <= 1000.00){
            renda = renda * 0.08f;
            System.out.print("Vc pagara: "+renda);
        }
        else if (renda >1000.01 && renda <= 2500.00){
            renda = renda * 0.18f; 
            System.out.print("Vc pagara: "+renda);
        }
        else {
            renda = renda * 0.28f; 
            System.out.print("Vc pagara: "+renda);
        }
        
    }
}