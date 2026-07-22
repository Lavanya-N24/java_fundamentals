public class MD_array {
    public static void main(String[] args) {
        int[][] arr = new int [4][3];
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
        }
    
     for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
    System.out.print(arr[i][j]+" ");//dont use ln here because it will print in new line
            }

System.out.println();//use ln here to print in new line
     }
     //updated for loop to print the 2D array in a matrix format
   for(int n[]:arr){
        for(int m:n){
            System.out.print(m+" ");
        }
        System.out.println();
   }
    }
}

