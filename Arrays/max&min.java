import java.util.*;
class sorting {
    public static void main(String[] args) {
        
        int[] arr = {2,3,4,57,2,6,9,5};
        quicksort(arr, 0, arr.length-1);
        int n = arr.length;
        
             System.out.println("Minimum ele:"+ arr[0]);
            System.out.println("Maximum ele:"+ arr[n-1]);
           
        
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot-1);
            quicksort(arr, pivot+1, high);
        }
    }
   public static int partition(int[] arr, int low, int high){
         int pivot = arr[high];
         int i = low-1;
         
         for(int j=low;j<high;j++){
             if(arr[j]<=pivot){
                 i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
         }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    
    return i+1;
    }
}
