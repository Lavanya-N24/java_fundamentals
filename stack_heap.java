class Student {
    int age = 20;
}

public class stack_heap {

    static void show() {
        int x = 10;                // Stack
        Student s = new Student(); // 's' in Stack, object in Heap
    }

    public static void main(String[] args) {
        show();
    }
}