package arrays.Ordenação;

import java.util.Random;
// sucessores dos números aleatórios.

public class arraysOrdenação {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0 ;  i <numerosAleatorios.length ; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+ " ");
        }

        System.out.println("\nSucessores dos números aleatórios");
        for (int numero: numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}
