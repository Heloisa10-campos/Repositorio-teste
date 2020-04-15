/*Leia um número inteiro que representa um código de DDD para discagem interurbana. 
Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, 
o programa deverá informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada. 
Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.
*/

import java.util.Scanner;
public class DDD{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int DDD;

        System.out.print("Digite o DDD por favor:");
        DDD = teclado.nextInt();

        if(DDD ==61){
            System.out.print("Brsilia")
        }
        else if(DDD ==71){
            System.out.print("Salvador")
        }
        else if(DDD ==11){
            System.out.print("São Paulo")
        }
        else if(DDD ==21){
            System.out.print("Rio de Janeiro")
        }
        else if(DDD ==32){
            System.out.print("Juiz de Fora")
        }
        else if(DDD ==19){
            System.out.print("Campinas")
        }
        else if(DDD ==27){
            System.out.print("Vitoria")
        }
        else if(DDD ==31){
            System.out.print("Belo Horizonte")
        }
    }
}

