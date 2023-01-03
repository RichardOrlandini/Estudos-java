package Construtores.SimplesProduct;

public class Product {

   public  String name;
    public Double price;
    public int quantity;

    public Product(String name, double price, int quantity){
        // => é o cara que executa no momento da estanciação do objeto ex produc p = new Product
        // a palavra this significa uma refÊncia para o proximo objeto.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public double totalValueInStock(){

        return  price * quantity;
    }

    public  void  addProducts(int quantity){                   // this: palavra reservada que significa uma auto referencia para o objeto
         this.quantity += quantity;                       // ao usar estou sendo especifico que quero usar o atributo da classe.
    }

    public void removeProdutc(int quantity){

        this.quantity -= quantity;
    }

    public String toString(){ // sobrepondo a versão padrão para quando chamarmos o product, ele retornar esses valores.
        return name
        + ", $ "
        +  String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
    }


    

}
