/*!

Joseph Bepo 
12 December 2023
This is a Java program to show perishable products with the driver class.
**/


import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Create multiple Products with valid data
        Product product1 = new Product(1, "Apple", 1.5, 10, 5, "Keep refrigerated");
        Product product2 = new Product(2, "Banana", 2.0, 20, 3, "Store in a cool place");
        Product product3 = new Product(3, "Orange", 1.8, 30, 4, "Keep away from heat");

        // Create multiple Perishable Products with valid data
        PerishableProduct perishableProduct1 = new PerishableProduct(101, "Milk", 2.5, 50, 20, "Keep refrigerated", "12-12-2023");
        PerishableProduct perishableProduct2 = new PerishableProduct(102, "Bread", 1.0, 100, 30, "Store in a cool, dry place", "15-12-2023");

        // Store all the products in an ArrayList
        List<Product> allProducts = new ArrayList<>();
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(perishableProduct1);
        allProducts.add(perishableProduct2);

        // Display details of all products in the collection
        System.out.println("Displaying All Products:");
        for (Product product : allProducts) {
            product.display();
        }
    }
}
