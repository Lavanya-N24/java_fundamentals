 class Calculator2{
    int n1,n2;
    void add(){
        System.out.println(n1+n2);
     
    }
    void sub(){
        System.out.println(n1-n2);
    }

}
 class AdvancedCalculator extends Calculator2{
    void mul(){
        System.out.println(n1*n2);
    }
    void div(){
        System.out.println(n1/n2);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        AdvancedCalculator ac=new AdvancedCalculator();
        ac.n1=10;
        ac.n2=5;
         System.out.println("Addition");
        ac.add();
        System.out.println("Subtraction");
        ac.sub();
        System.out.println("Multiplication");
        ac.mul();
        System.out.println("Division");
        ac.div();
       
    }
}
