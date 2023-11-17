import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Vaccine {
    private int id;
    private String name;
    private double cost;
    private int quantity;
    private Date expiryDate;

    public Vaccine() {
        id = 0;
        name = "Unknown";
        cost = 0.0;
        quantity = 0;
        expiryDate = new Date();
    }

    public Vaccine(int id, String name, double cost, int quantity, Date expiryDate) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void display(boolean tableFormat) {
        if (tableFormat) {
            System.out.println("SKU | Vaccine Name | Unit Cost | QTY | Expiry");
            System.out.println("----|--------------|-----------|-----|--------");
            System.out.printf("%-3d | %-13s | %-9.2f | %-3d | %s\n",
                    id, name, cost, quantity, new SimpleDateFormat("MM/dd/yyyy").format(expiryDate));
        } else {
            System.out.println("SKU: " + id);
            System.out.println("Vaccine Name: " + name);
            System.out.println("Unit Cost: " + cost);
            System.out.println("Quantity on hand: " + quantity);
            System.out.println("Expiry Date: " + new SimpleDateFormat("MM/dd/yyyy").format(expiryDate));
        }
    }

    public static Vaccine createVaccineFromUserInput(Scanner scanner) {
        Vaccine vaccine = new Vaccine();

        System.out.println("\nEnter ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Vaccine Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Unit Cost:");
        double cost = scanner.nextDouble();
        System.out.println("Enter Quantity:");
        int quantity = scanner.nextInt();
        System.out.println("Enter Expiry Date (MM/dd/yyyy):");
        String dateString = scanner.next();
        Date expiryDate = null;
        try {
            expiryDate = new SimpleDateFormat("MM/dd/yyyy").parse(dateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Using current date as default.");
            expiryDate = new Date();
        }

        vaccine.setId(id);
        vaccine.setName(name);
        vaccine.setCost(cost);
        vaccine.setQuantity(quantity);
        vaccine.setExpiryDate(expiryDate);

        return vaccine;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vaccines to add:");
        int numVaccines = scanner.nextInt();

        Vaccine[] vaccines = new Vaccine[numVaccines];

        for (int i = 0; i < numVaccines; i++) {
            System.out.println("\nAdding details for Vaccine " + (i + 1) + ":");
            vaccines[i] = Vaccine.createVaccineFromUserInput(scanner);
        }

        System.out.println("\nDo you want to display the details in table format? (true/false):");
        boolean displayTableFormat = scanner.nextBoolean();

        System.out.println("\nDisplaying Vaccine Details:");
        for (Vaccine vaccine : vaccines) {
            vaccine.display(displayTableFormat);
        }
    }
}
