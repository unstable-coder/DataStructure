import java.util.*;
class arrange012 {
    public static void main(String[] args) {
        int[] arr= {0,1,2,2,1,1,0,0,1};
        result(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] result(int[] arr){
        int zero=0;
        int one= 0;
        int two =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0) zero++;
            if(arr[i]==1) one++;
            if(arr[i]==2) two++;
        }
        for(int i =0;i<zero;i++){
            arr[i] =0;
        }
        for(int i =zero;i<arr.length-two;i++){
            arr[i] =1;
        }
        for(int i =arr.length-two;i<arr.length;i++){
            arr[i] =2;
        }
        return arr;
    }
}
