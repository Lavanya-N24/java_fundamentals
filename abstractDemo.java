abstract class Vehicle5{

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle5 {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle5 {

    @Override
    void start() {
        System.out.println("Bike starts with self-start");
    }
}

public class abstractDemo {
    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();

        c.start();
        b.start();

        c.stop();
    }
}