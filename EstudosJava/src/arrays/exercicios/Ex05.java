package arrays.exercicios;
// imprimindo a média dos pares.
import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
        int[] vet = new int[N];
        double average = 0;
        int count = 0;

        for (int i = 0 ; i < N; i++ ){
            vet[i] = sc.nextInt();
        }

        for (int j = 0 ; j < N ; j++){
            if (vet[j] % 2 == 0){
                average += vet[j];
                count++;
            }
        }
        average = average / count;
        System.out.println();

        System.out.printf("Média aritmetica somente dos pares: %.2f " , average);
    }
}
