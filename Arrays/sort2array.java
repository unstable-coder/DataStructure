class Solution
{
 
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int last =n-1;
        int first = 0;
      while(last>=0 && first<m){
          if(arr1[last]>arr2[first]){
              long temp = arr1[last];
              arr1[last] = arr2[first];
              arr2[first] = temp;
          }
              first++;
              last--;
          
      }
      Arrays.sort(arr2);
      Arrays.sort(arr1);
    }
}
