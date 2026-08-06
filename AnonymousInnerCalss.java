class OuterClass {  
     void display() {  
         System.out.println("This is an example of outer class");  
     }
   
}
public class AnonymousInnerCalss {
    public static void main(String[] args) {
    
     OuterClass anonymousInner = new OuterClass() {
            @Override
            public void display() {
                System.out.println("This is an example of anonymous inner class");
            }
        };

        anonymousInner.display();
    }

}

