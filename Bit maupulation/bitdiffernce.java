class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
       int value = a ^ b; 
         int count = 0;
    while (value != 0) {
        value &= (value - 1); // Flips the rightmost set bit to 0
        count++;
    }
    return count;
        
    }
    
    
}
