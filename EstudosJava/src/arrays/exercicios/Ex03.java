package arrays.exercicios;
// somando 2 vetores
import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

       int N = sc.nextInt();

       int[] A = new int[N];
       int[] B = new int[N];

        System.out.println("Vetor A: ");
       for (int i = 0 ; i < N ; i++){
           A[i] = sc.nextInt();
       }

        System.out.println("Vetor B: ");
        for (int j = 0 ; j < N ; j++){
            B[j] = sc.nextInt();
        }


        int[] C = new int[N];

        for (int i = 0 ; i < N ; i++){
            C[i]= A[i] + B[i];
        }

        System.out.println("Vetor C: ");

        for (int j = 0 ; j < C.length ; j++){
            System.out.print(C[j] + " ");
        }

    }
}
