package Construtores.SimplesProduct;

import Construtores.SimplesProduct.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Digite o preço: ");
        double price = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantity = sc.nextInt();

        Product product  = new Product(name, price, quantity); // construtor.

        System.out.println();
        System.out.println("Product Data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
         quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update Data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed form stock: ");
         quantity = sc.nextInt();
        product.removeProdutc(quantity);

        System.out.println();
        System.out.println("Update Data: " + product);
        sc.close();
    }
}
