class Teacher{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
public class getterAndSetter {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setName("asha");
        teacher.setAge(30);
        System.out.println("Teacher Name: "+teacher.getName());
        System.out.println("Teacher Age: "+teacher.getAge());
    }
}
