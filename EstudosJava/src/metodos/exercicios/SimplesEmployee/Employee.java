package metodos.exercicios.SimplesEmployee;

public class Employee {
    public String name;
    public Double wage, rate;

    public double netSalary(){
        return wage - rate;
    }

    public Double increaseSalary(double percentage){
        return wage += wage * percentage / 100;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary()) ;
    }


}
