
    class Employee12 {

    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee12 {

    @Override
    void work() {
        System.out.println("Manager manages the team");
    }
}

class Developer extends Employee12 {

    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

public class polymorphism {

    public static void main(String[] args) {

        Employee12 e;

        e = new Manager();
        e.work();

        e = new Developer();
        e.work();
    }
}

