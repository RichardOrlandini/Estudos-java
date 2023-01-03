package arrays.exercicios;

// Média de Números.

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
        double[] vet = new double[N];
        double average = 0;

        for (int i = 0; i < N ; i++){
            vet[i] = sc.nextDouble();
            average += vet[i] ;
        }
        average = average / N ;

        System.out.printf("Média aritmetica dos números:  %.2f", average  );

        System.out.println();

        for (int i = 0 ; i < N ; i++){
            if (vet[i] < average){
                System.out.println(vet[i]);
            }
        }


    }
}
