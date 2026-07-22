public class reference_variable {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Age of student: " + s1.age);
    }

}
class Student {
    int age = 20;
}
