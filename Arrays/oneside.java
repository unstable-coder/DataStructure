class oneside {
    public static void main(String[] args) {
        int[] arr = {9,-1,4,-1,-4,2};
        MoveNeg(arr);
       for(int num : arr){
           System.out.println(num);
       }
    }
    public static int[] MoveNeg(int[] arr){
        int j = arr.length-1;
        int i =0;
       while(i<j){
            if(arr[i]>0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                 i--;
            j--;
            }
          i++; 
        }
        return arr;
    }
}
