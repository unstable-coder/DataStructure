import java.util.*;
class subarray{
    public static void main(String[] args) {
        int[] arr= {1,2,3,-2,5};
     System.out.println(subsum(arr, arr.length));
       
    }
    public static int subsum(int[] arr, int n){
        int sum = arr[0];
        int cursum = arr[0];
        for(int i =1;i<n;i++){
            cursum = Math.max(arr[i], cursum+arr[i]);
            if(cursum>sum) sum = cursum;
        }
         return sum;
    }
}
