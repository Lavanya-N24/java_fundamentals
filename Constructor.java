class animal{
    private String name;
    private int age;
    //constructor
    public animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    
}

public class Constructor {
    public static void main(String[] args) {
        animal a=new animal("dog",5);
        System.out.println("Animal Name : "+a.getName());
        System.out.println("Animal Age : "+a.getAge());
        
    }
    
}
