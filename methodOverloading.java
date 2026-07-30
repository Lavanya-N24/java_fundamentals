
    class Calculator3 {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }
}

public class methodOverloading {
    public static void main(String[] args) {

        Calculator3 c = new Calculator3();

        c.add(10, 20);
        c.add(10, 20, 30);
        c.add(5.5, 4.5);
        
    }
}

