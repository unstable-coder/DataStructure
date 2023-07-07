import java.util.*;
class cyclic{
    public static void main(String[] args) {
        int[] arr= {2,4,1,5,7,4};
       rotate(arr, arr.length);
       System.out.println(Arrays.toString(arr));
       
    }
    public static int[] rotate(int[] arr, int n){
        int temp  = arr[n-1];
        for(int i =n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
}
