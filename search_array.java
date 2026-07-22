public class search_array {
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        int search=40;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                found=true;
                System.out.println("Element found at index: " + i);
            break;
            }
            else{
                found=false;
            }

        }
        System.out.println("Element found: " + found);
    }
}
    

