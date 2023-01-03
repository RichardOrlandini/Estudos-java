package metodos.exercicios.SimplesCotaçãoDolar;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter ccv = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        ccv.dolarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        ccv.valueToBuy = sc.nextDouble();

        double result = ccv.totalValue();

        double resultGross = CurrencyConverter.calculaterIOF(result);

        System.out.print(ccv);
        System.out.printf("  " +  String.format("%.2f", resultGross));

        sc.close();
    }
}
