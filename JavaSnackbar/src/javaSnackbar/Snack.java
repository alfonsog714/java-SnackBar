package javaSnackbar;

public class Snack {
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    public Snack(String name, int quantity, double cost, int vendingId) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingId = vendingId;

    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVendingId(int vendingId) {
        this.vendingId = vendingId;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getVendingId() {
        return vendingId;
    }

    public int getQuantity() {
        return quantity;
    }

    // ---------------

    public void addQuantity(int added) {
        this.quantity += added;
    }

    public void buySnack(int amount) {
        this.quantity -= amount;
    }

    public double getTotalCost(int amount) {
        return this.cost * amount;
    }
}