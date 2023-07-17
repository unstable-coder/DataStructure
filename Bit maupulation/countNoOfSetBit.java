class Solution {
    public static int countSetBits(int n)
    {
        // Your logic here
        int cnt = 0;
        for(int i=1;i<=n;i++) {
            int x=i;
            while(x>0){
                if((x&1)==1) cnt++;
                x /= 2;
            }
        }
        return cnt;
    }
}
//while loop will execute in log(i) time complexity and i ranging from 1 to N.
