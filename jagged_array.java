public class jagged_array {
    public static void main(String[] args) {
        int arr[][] = new int[3][]; // declaring a jagged array with 3 rows
        arr[0] = new int[2]; // first row has 2 columns
        arr[1] = new int[3]; // second row has 3 columns
        arr[2] = new int[4]; // third row has 4 columns
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = (int) (Math.random() * 10); // assigning random values to the jagged array
        }
    }
    for(int n[]:arr){
        for(int m:n){
            System.out.print(m+" ");
        }
        System.out.println();
    }

  }
}
