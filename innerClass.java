
    class Student6 {

    private String name = "Lavanya";

    class Details {

        void show() {
            System.out.println(name);
        }
    }
}

public class innerClass {

    public static void main(String[] args) {

        Student6 s = new Student6();
        Student6.Details d = s.new Details();

        d.show();
    }
}

