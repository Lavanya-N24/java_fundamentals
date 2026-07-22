public class sort_array {
    public static void main(String args[]){
        int arr[]={14,23,5,10,12}  ;
        int size=arr.length;  
        int temp=0;
        System.out.print("before sorting"+" ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
   //after sorting
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
     System.out.print("after sorting:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

          