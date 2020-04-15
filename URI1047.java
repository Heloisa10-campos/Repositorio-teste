import java.util.Scanner;
public class URI1047{
    public static void main (=String args[]);
        Scanner teclado = new Scanner(System.in);
        int hIni, mIni, hFim, mFim;
        int hor, min;

        hIni = teclado.nextInt();
        mIni = teclado.nextInt();
        hFim = teclado.nextInt();
        mFim = teclado.nextInt();

        if (hFim > hIni){
            hor = hFim - hIni;
        }
        else if (hFim <hIni){
            hor = 24 - (hFim - hIni);
        }
        else if (hFim == hIni){
            hor = 0;
        }
        if 
}