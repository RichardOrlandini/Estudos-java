package loops;

import java.util.Scanner;

public class exFor {
    public static void main(String[] args) {

        // quando precisar utilizar um contatodor, usamos o for
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorial");
        int fatorial  =  sc.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");
        for ( int i = fatorial ; i >= 1  ; i-- ){
            multiplicacao = multiplicacao * i;

        }
        System.out.println(multiplicacao);
    }
}
