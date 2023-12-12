/*!

Joseph Bepo 
12 December 2023
This is a Java program to show perishable products with the driver class.
**/


import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // multiple Products with valid data of your choice (at least 3).
        Product product1 = new Product(1, "Apple", 1.5, 10, 5, "Keep refrigerated");
        Product product2 = new Product(2, "Banana", 2.0, 20, 3, "Store in a cool place");
        Product product3 = new Product(3, "Orange", 1.8, 30, 4, "Keep away from heat");

        // all the products created (perishable and non-perishable) in one container of your choice (can be an array, vector, LinkedList...)
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        
        // Utilize your collection to display all the details of its contents.
        for (Product product : products) {
            product.display();
        }
    }
}