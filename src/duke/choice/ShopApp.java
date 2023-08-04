package duke.choice;

import java.util.ArrayList;
import java.util.List;

public class ShopApp {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John Doe"));
        customers.add(new Customer("Jane Smith"));
        customers.add(new Customer("Mike Johnson"));

        // Print all new customers
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
}