package metodos.exercicios.SimplesCotaçãoDolar;

public class CurrencyConverter {

   public double dolarPrice;
   public double valueToBuy;

   public static int IOF = 6;

    public double totalValue(){
        return dolarPrice * valueToBuy;

    }

   public static double calculaterIOF(double totalValue){
    return (totalValue * IOF) / 100 + totalValue;
   }

    public String toString(){
        return "Amount to be paid in reais = ";

    }
}
