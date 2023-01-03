package basic;

import java.util.Locale;
import java.util.Scanner;

public class saidaTela {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);   // inprime com (.)
        Scanner sc = new Scanner(System.in);

        double x = 10.123456;
        System.out.printf("%.2f%n", x); // inprimindo com 2 casas decimais
    }
}
