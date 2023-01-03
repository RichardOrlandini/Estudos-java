package arrays.exercicios;

import java.util.Scanner;

public class exForit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeCosoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = sc.next(); // entrada

            if ( !(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantidadeCosoantes++;
            }
            count++;
        } while (count < consoantes.length); // enquanto o contador for menor que o tamanho do array

        System.out.println("Consoantes: ");
        for (String consoante: consoantes ) {
            if( consoante != null){
                System.out.println(consoante);
            }
        }
    }
}
