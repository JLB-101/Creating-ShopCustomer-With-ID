package duke.choice;

public class Customer {
    private static int nextId = 1;
    private int id;
    private String name;

    public Customer(String name) {
        this.id = nextId;
        nextId++; // Increment the ID for the next instance
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //to print all customers
    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + name;
    }


}
