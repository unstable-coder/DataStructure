class KadenAlgo{
    public static void main(String[] args){
        int[] arr=  {2,1,3,5,-6,7};
        System.out.println(kaden(arr));
    }
    public static int kaden(int[] arr){
        int sum =arr[0];
        int cursum=arr[0];
        for(int i =1;i<arr.length;i++){
             cursum = Math.max(arr[i], cursum+arr[i]);
            if(cursum>sum) sum = cursum;
        }
        return sum;
    }
}
