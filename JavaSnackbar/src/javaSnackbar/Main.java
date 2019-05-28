package javaSnackbar;

public class Main {

    private static void startProgram() {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocobar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        System.out.println("***Q1***");
        jane.setCash(jane.getCash() - soda.getTotalCost(3));
        soda.buySnack(3);

        System.out.println(jane.getCash());
        System.out.println(soda.getQuantity());

        System.out.println("***Q2***");

        jane.setCash(jane.getCash() - pretzel.getTotalCost(1));
        pretzel.buySnack(1);

        System.out.println(jane.getCash());
        System.out.println(pretzel.getQuantity());

        System.out.println("***Q3***");

        bob.setCash(bob.getCash() - soda.getTotalCost(2));
        soda.buySnack(2);

        System.out.println(bob.getCash());
        System.out.println(soda.getQuantity());

        System.out.println("***Q4***");

        bob.addCash(10.00);
        System.out.println(bob.getCash());

        System.out.println("***Q5***");

        jane.setCash(jane.getCash() - chocobar.getTotalCost(1));
        chocobar.buySnack(1);

        System.out.println(jane.getCash());
        System.out.println(chocobar.getQuantity());

        System.out.println("***Q6***");

        pretzel.addQuantity(12);

        System.out.println(pretzel.getQuantity());

        System.out.println("***Q7***");
        bob.setCash(bob.getCash() - pretzel.getTotalCost(3));
        pretzel.buySnack(3);

        System.out.println(bob.getCash());
        System.out.println(pretzel.getQuantity());
    }

    public static void main(String[] args) {
        startProgram();
    }
}