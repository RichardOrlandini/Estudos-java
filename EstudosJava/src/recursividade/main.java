package recursividade;

public class main {
    public static void main(String[] args) {
        int fatoriln = 5;
        fatorial(fatoriln);

        int recursividadeN = recursividade(fatoriln);

        System.out.println(recursividadeN);
    }

    private  static  void   fatorial(int number){
        int total = 1;

        for(int i = number; i > 1; i--){
            total = total * i;
        }
        System.out.println(total);
    }


    private static int recursividade(int number){
        if(number == 1){
            return 1;
        }
        return number * recursividade(number -1);
    }
}
