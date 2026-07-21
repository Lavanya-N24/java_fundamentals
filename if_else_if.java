public class if_else_if {
    public static void main(String arg[])
    {
        int x=8;
        int y=9;
        int z=6;
        if(x>y &&x>z)
        {
            System.out.println("x is greater");
        }
        else if(y>x && y>z)
        {
            System.out.println("y is greater");
        }
        else
        {
            System.out.println("z is greater");
        }
    }
}
