class Students {
    int age = 20;
}

public class stack_heap {

    static void show() {
        int x = 10;                // Stack
        Students s1 = new Students(); // 's1' in Stack, object in Heap
      System.out.println(s1.age); 
      System.out.println(x);
    }

    public static void main(String[] args) {
        show();
    }
}