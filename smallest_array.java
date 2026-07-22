public class smallest_array {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[0]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element in the array is: " + smallest);
        
    }
}

        