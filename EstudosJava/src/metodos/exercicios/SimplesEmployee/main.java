package metodos.exercicios.SimplesEmployee;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.next();
        System.out.print("Gross salary: ");
        employee.wage = sc.nextDouble();
        System.out.print("Tax: ");
        employee.rate = sc.nextDouble();

        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());

        System.out.print("Which percentage to incrase salary? ");
        double percentege =  sc.nextDouble();
        employee.increaseSalary(percentege);

        System.out.println();
        System.out.println("Update date: " + employee);

        sc.close();

    }

}
