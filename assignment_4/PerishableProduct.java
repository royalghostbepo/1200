public class PerishableProduct extends Product {

    
    public static void main(String[] args) {
        PerishableProduct perishableProduct = new PerishableProduct();
        perishableProduct.display();
    }
    

    private String expiryDate;

    // Default constructor
    public PerishableProduct() {
        super();
        this.expiryDate = "01-01-2000";
    }

    // Parameterized constructor
    public PerishableProduct(int sku, String name, double unitCost, int quantityInStore, int quantityToOrder, String specialInstructions, String expiryDate) {
        super(sku, name, unitCost, quantityInStore, quantityToOrder, specialInstructions);
        this.expiryDate = expiryDate;
    }

    // Getters and Setters
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Display function
    @Override
    public void display() {
        System.out.println("Perishable Product Details:");
        super.display();
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println();
    }
}
