class Students {
    int age = 20;
}

public class stack_heap {

    static void show() {
        int x = 10;                // Stack
        Students s1 = new Students(); // 's' in Stack, object in Heap
    }

    public static void main(String[] args) {
        show();
    }
}