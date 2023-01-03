package arrays.exercicios;
// ordenando um arrays de trás para frente.
public class exArray {
    public static void main(String[] args) {
        int[] vetor = {-5, 0, 15, 50, 8, 4};
        int count = 0;

        System.out.print("Vetor 1: ");
        while (count <= (vetor.length -1)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor 2: ");
        for (int i = (vetor.length -1); i >= 0; i--){ // i na posição 5 im
            System.out.print(vetor[i] + " ");
        }

    }
}
