class StudentDetails {
    int id;
    String name;
    int age;
}

public class ArrayOfObject {

    public static void main(String[] args) {

        // Create Student objects
        StudentDetails s0 = new StudentDetails();
        s0.id = 101;
        s0.name = "John";
        s0.age = 20;

        StudentDetails s1 = new StudentDetails();
        s1.id = 102;
        s1.name = "Alice";
        s1.age = 22;

        StudentDetails s2 = new StudentDetails();
        s2.id = 103;
        s2.name = "Bob";
        s2.age = 21;

        // Create array of objects
        StudentDetails[] students = {s0, s1, s2};

        // Print details
        System.out.println("Student Details:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(
                "ID: " + students[i].id +
                ", Name: " + students[i].name +
                ", Age: " + students[i].age
            );
        }
    }
}

