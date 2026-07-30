
 class Person {
  void introduce() {
        System.out.println("I am a person.");
    }
}

class CollegeStudent extends Person {
    @Override
    void introduce() {
        System.out.println("I am a college student.");
    }
}

public class methodOverride { 
    public static void main(String[] args) {
        
        CollegeStudent s = new CollegeStudent();
        s.introduce();
    }
}

