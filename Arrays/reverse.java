import java.util.*;
class reverse{
 
    static int[] rev(int[] arr , int n){
        int i=0;
        int j= arr.length-1;
        while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }
        return arr;
    }
    public static void main(String[] args) {
      int[] arr = {3,5,3,2,6,8,8};
      System.out.print(Arrays.toString(rev(arr, arr.length)));
    }
}
