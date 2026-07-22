public class reference_variable {
    public static void main(String[] args) {
        Student s1 = new Student();//reference variable is s1 this stores in stack and object is student stores in heap
        System.out.println("Age of student: " + s1.age);
    }

}
class Student {
    int age = 20;//instance variable is age this stores in heap
}
