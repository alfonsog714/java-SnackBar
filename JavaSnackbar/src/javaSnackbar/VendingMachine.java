package javaSnackbar;

public class VendingMachine {
    private static int maxId = 0;

    private String name;
    private int id;

    public VendingMachine(String name) {
        maxId++;

        id = maxId;

        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}