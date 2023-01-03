package metodos.exercicios;

public class exMetodos {

    public static double area(double lado) {

        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior+baseMenor)*altura) / 2;
    }

    public static void xpto() {

        System.out.println("Antes");
        return;
    }

    public static double abc() {
        return 1.6;
    }


    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = exMetodos.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = exMetodos.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = exMetodos.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);


    }
}
