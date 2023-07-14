class Solution
{
    public int[] singleNumber(int[] arr)
    {
        int[] res = new int[2];
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum = (sum ^ arr[i]);
        }
        sum = (sum & -sum);
        
        for(int i =0;i<arr.length;i++){
            if((arr[i] & sum)> 0){
                res[0] = (res[0] ^ arr[i]);
            }else{
                res[1] = (res[1] ^ arr[i]);
            }
        }
        if(res[0]>res[1]){
            int temp = res[0];
            res[0] = res[1];
            res[1] = temp;
        }
        return res;
    }
}
