package loops;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = sc.nextInt();
            count++;
        }while (count <5);
    }

}
