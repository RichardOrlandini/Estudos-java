package arrays.exercicios;
// mostrar os números pares
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
        int[] vet = new int[N];
        int amount = 0;

        for (int i = 0 ; i < N ; i++){
            vet[i] = sc.nextInt();
        }

        for (int j = 0 ; j< N ; j++){
            if( vet[j] % 2 == 0){
                System.out.print(vet[j] + " ");
                amount++;
            }
        }

        System.out.print("\n "+ amount);


    }
}
