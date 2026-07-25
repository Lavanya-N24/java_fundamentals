class CoffeeShop {
    static int totalCoffeeSold = 0;

    void sellCoffee() {
        totalCoffeeSold++;
    }

    static void totalSold() {
        System.out.println("Total coffee sold: " + totalCoffeeSold);
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        CoffeeShop shop1 = new CoffeeShop();
        CoffeeShop shop2 = new CoffeeShop();

        shop1.sellCoffee();
        shop2.sellCoffee();
        shop1.sellCoffee();

        CoffeeShop.totalSold();
    }
}
