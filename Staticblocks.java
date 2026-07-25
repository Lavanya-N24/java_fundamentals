class Demo{
    static int a1=10;
    static{
        for(int i=0;i<5;i++){
            a1=a1+i;
        } 
        System.out.println("Static block initialized");
    }
}
public class Staticblocks {
    public static void main(String[] args) {
        System.out.println("Value of a: " + Demo.a1);
    }
    
}
