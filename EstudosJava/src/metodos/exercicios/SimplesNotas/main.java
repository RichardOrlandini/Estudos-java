package metodos.exercicios.SimplesNotas;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.print("White your name: ");
        st.name = sc.next();

        System.out.println("Digite suas notas: ");
        st.note1 =  sc.nextDouble();
        st.note2 =  sc.nextDouble();
        st.note3 =  sc.nextDouble();
        double result = st.sumNotes();
        System.out.println("Final Grade = " + result);

        if (result >= 60.0){
            System.out.println("PASS");
        }else if (result < 60.0){
            System.out.println("FAILED");
            double resultMissing = 60.0 - result;
            System.out.print("MISSING " + String.format("%.2f", resultMissing) +" POINTS");
        }else{
            System.out.println("Something went wrong!");
        }

    }
}
