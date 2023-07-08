
class Arrayjump{
    public static void main(String[] args) {
        int[] arr ={1, 3, 5, 8, 1, 2, 6, 7, 6, 8, 9} ;
        System.out.println(jump(arr, arr.length));
    }
    public static int jump(int[] arr,int n){
        int j = arr[0];
        if(j>=n) return 1;
        
        int count =1;
        for(int i = j;i<n;i++ ){
            if((i+arr[i])>=n-1) return ++count;
            else{
               i = i + arr[i]-1;
               count++;
            }
        }
        return count;
    }
}
