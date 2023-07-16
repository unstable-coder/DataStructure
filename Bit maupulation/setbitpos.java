class Solution {
    static int findPosition(int N) {
        int position = 0;
        boolean foundSetBit = false;

        while (N > 0) {
            if ((N & 1) == 1) {  
                if (foundSetBit) {
                    return -1;
                }
                foundSetBit = true;
            }
            position++;
            N >>= 1;  
        }

        if (!foundSetBit) {
            return -1;
        } else {
            return position;
        }
}
}
