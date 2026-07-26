class Animals {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animals {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}
public class MultiInheritance{
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
 