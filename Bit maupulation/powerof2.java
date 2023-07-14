class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        int count =0;
        while(n!=0){
            n &= (n-1);
            count++;
        }
        if(count==1) return true;
        
        return false;
    }
    
}
