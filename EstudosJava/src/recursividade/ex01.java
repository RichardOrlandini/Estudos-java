package recursividade;

public class ex01 {
    /*é quando um método chama ele mesmo.
    1. Devemos ter um ponto de parada.
    */

    private static int recursividade(int number){
        if(number == 1){
            return 1;
        }
        return number * recursividade(number -1);
    }
}
