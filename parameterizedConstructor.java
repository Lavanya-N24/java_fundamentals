class movie{

    int id;
    String name;

    movie(int i, String n) {
        id = i;
        name = n;
    }
}

public class parameterizedConstructor {

    public static void main(String[] args) {

        movie m1 = new movie(101, "Lavanya");
        movie m2 = new movie(102, "Alice");

        System.out.println(m1.id + " " + m1.name);
        System.out.println(m2.id + " " + m2.name);
    }
}