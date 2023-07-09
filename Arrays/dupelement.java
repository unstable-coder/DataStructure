class Solution {
    public int findDuplicate(int[] nums) {
        int n =0;
       for(int i =0;i<nums.length;i++){
           if(nums[i]>n) n= nums[i];
       }
       int[] arr = new int[n+1];
       for(int i =0;i<nums.length;i++){
           if(arr[nums[i]]== nums[i]) return nums[i];
           else{
               arr[nums[i]] = nums[i];
           }
       }
       return 0;
    }
}
