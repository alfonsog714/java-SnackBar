package javaSnackbar;

public class Customer {
    private static int maxId = 0;

    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash) {
        maxId++;

        this.id = maxId;
        this.name = name;
        this.cash = cash;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public double getCash() {
        return this.cash;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    // ------------------
    public void addCash(double amount) {
        this.cash += amount;
    }

}