
class Person {
     String name;
     int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person created");
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age); // reuse Person's constructor, works even with private fields
        this.salary = salary;
        System.out.println("Employee created");
    }
}
public class SuperMtd {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 30, 50000.0);
        System.out.println("Employee salary: " + emp.salary);
   // This will also cause a compilation error because 'age' is private in Person
   System.out.println("Employee age: " + emp.age); // Compilation error
   System.out.println("Employee name: " + emp.name); // Compilation error
   
    }
}