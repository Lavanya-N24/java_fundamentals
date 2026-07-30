class calculator1{
    

   
    public int add(int n1,int n2){

      int r=n1+n2;
      return r;
    }

}
public class demo {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        calculator1 calc=new calculator1();//object creation-+-+-+-+-
        int sum=calc.add(num1,num2);
        System.out.println("The sum is: " + sum);
    
    }
}
