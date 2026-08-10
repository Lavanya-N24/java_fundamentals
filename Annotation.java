//annotation class
class Myresult{
     void show(){
         System.out.println("Myresult show method");
     }
    }
class mark extends Myresult{
    @Override
    public void show() {
        System.out.println(" Marks are good");
    }

}
public class Annotation {
    public static void main(String[] args) {
        mark m = new mark();
        m.show();
    }
    

    
}
