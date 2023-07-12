class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a,b) ->  Integer.compare(a[0],b[0])); // sort the array 
        List<int[]>  res= new ArrayList<>(); 
        int[] intr = arr[0]; // insert first element of 2d array in new array.
        res.add(intr);
        for(int[] num : arr){
            int nxtstrt = num[0];
            int nxtend = num[1];
            int cur_strt = intr[0];
            int cur_end =  intr[1];
        
        if(cur_end>=nxtstrt){
            intr[1] = Math.max(cur_end,nxtend);
        }else{
            intr = num;
            res.add(intr);
        }
    }
        return res.toArray(new int[res.size()][]); // convert the list into 2d array.
    }
}
