package metodos.exercicios.tv;

public class usuario {
  public static void main(String[] args) throws Exception {
    
    SmartTv smartTv = new SmartTv();

    System.out.println("A tv está ligada? "+ smartTv.ligada);
    System.out.println("Qual canal? "+smartTv.canal);
    System.out.println("Volume atual? "+smartTv.volume);


    smartTv.ligar();
    System.out.println("Novo Status: " + smartTv.ligada);
  }
}
