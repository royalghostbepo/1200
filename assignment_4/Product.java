/*!

Joseph Bepo 
12 December 2023
This is a Java program to show perishable products with the driver class.
**/

public class Product {
    private int sku;
    private String name;
    private double unitCost;
    private int quantityInStore;
    private int quantityToOrder;
    private String specialInstructions;

    // Default constructor
    public Product() {
        this.sku = 0;
        this.name = "Default Product";
        this.unitCost = 0.0;
        this.quantityInStore = 0;
        this.quantityToOrder = 0;
        this.specialInstructions = "No special instructions";
    }

    // Parameterized constructor
    public Product(int sku, String name, double unitCost, int quantityInStore, int quantityToOrder, String specialInstructions) {
        this.sku = sku;
        this.name = name;
        this.unitCost = unitCost;
        this.quantityInStore = quantityInStore;
        this.quantityToOrder = quantityToOrder;
        this.specialInstructions = specialInstructions;
    }

    // Getters and Setters
    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public int getQuantityInStore() {
        return quantityInStore;
    }

    public void setQuantityInStore(int quantityInStore) {
        this.quantityInStore = quantityInStore;
    }

    public int getQuantityToOrder() {
        return quantityToOrder;
    }

    public void setQuantityToOrder(int quantityToOrder) {
        this.quantityToOrder = quantityToOrder;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // Display function
    public void display() {
        System.out.println("Product Details:");
        System.out.println("SKU: " + sku);
        System.out.println("Product Name: " + name);
        System.out.println("Unit Cost: " + unitCost);
        System.out.println("Quantity in Store: " + quantityInStore);
        System.out.println("Quantity Needed: " + quantityToOrder);
        System.out.println("Special Instructions: " + specialInstructions);
        System.out.println();
    }
}
