package application;

import java.util.Scanner;

import entities.Product;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        product.setName("TV - LG");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println("Product data: " + product);
        System.out.println("Enter the number of products to be added in stock: " + product);
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Uptated data: " + product);
        System.out.println("Enter the number of products to be removed from stock: " + product);
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Uptaded data: " + product);
        sc.close();
    }
}