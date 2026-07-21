public class nested_while {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            System.out.println("morning: "+i);
            int j=1;
            while(j<=3){
                System.out.println("afternoon: "+j);
                j++;
            
            
            }
            i++;
        }
    }
}
