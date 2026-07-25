class CoffeeShops{
    static int totalCoffeesold=0;
    void sellCoffee(){
        totalCoffeesold++;
        System.out.println("Total coffee sold: " + totalCoffeesold);
    }
    }

    public class StaticVariable {
        public  static void main(String arg[]){
            CoffeeShops shop1=new CoffeeShops();
            CoffeeShops shop2=new CoffeeShops();
            shop1.sellCoffee();
            shop2.sellCoffee();
            shop1.sellCoffee();
        }
    
}
