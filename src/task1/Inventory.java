package task1;

import java.util.HashSet;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        HashSet <String> products = new HashSet<>();
        products.add("soap");
        products.add("powder"); //for method check
        addProduct(products);
        System.out.println("Inventory: " + products);
        removeProduct(products);
        System.out.println("Inventory after remove: " + products);
    }

    public static void addProduct(HashSet <String> products){
        System.out.println("Enter product: ");
        String product = new Scanner(System.in).nextLine();
        if (products.contains(product)){
            System.out.println("The product has already added.");
        } else {
            products.add(product);
        }
    }

    public static void removeProduct(HashSet <String> products){
        System.out.println("Enter product for remove: ");
        String product = new Scanner(System.in).nextLine();
        if (products.contains(product)){
           products.remove(product);
        } else {
            System.out.println("The product you want to delete is not in inventory");
        }
    }
}
