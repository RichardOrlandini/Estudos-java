package loops;

import java.util.Scanner;

public class whileComBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while (true){
            System.out.println("Nome: ");
            nome = sc.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = sc.nextInt();

        }

        System.out.println("Saiu do Lasso");

        // ou
    /*    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int note;

            while(true){
                System.out.println("Digite uma nota entre 0 e 10");
                note = sc.nextInt();
                if (note >= 0 && note <=10){
                    break;
                }else{
                    System.out.println("Valor inválido");
                }
            }

            // ou

            System.out.println("Digite uma nota entre 0 e 10");
            note = sc.nextInt();

            while( note < 0 | note >10){
                System.out.println("Valor inválido");
                System.out.println("Digite uma nota entre 0 e 10");
                note = sc.nextInt();
            }
        }*/
    }

}
