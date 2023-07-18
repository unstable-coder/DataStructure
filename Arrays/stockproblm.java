class Solution {
    public int maxProfit(int[] arr) {
        int  profit=0;
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        for(int i =arr.length-2;i>=0;i--){
            if(st.peek()<arr[i]){
                st.pop();
                st.push(arr[i]);
            }else{
              int diff =   st.peek()-arr[i];
              if(diff>profit) profit = diff;
            }
            
        }
        return profit;
    }
}
