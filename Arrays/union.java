import java.util.*;
class union{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {1,2,4,5,6};
       System.out.println(uni(a,b));
        
    }
    public static int uni(int[] a, int[] b){
        Map<Integer, Integer> hs = new HashMap<>();
        if(a.length>b.length){
           for(int i=0;i<a.length;i++){
               hs.put(a[i],0);
            }
            for(int i=0;i<b.length;i++){
                if(hs.containsKey(b[i])){
                    continue;
                }
                hs.put(b[i],0);
            }
        }else{
            for(int i=0;i<b.length;i++){
               hs.put(b[i],0);
            }
             for(int i=0;i<a.length;i++){
                if(hs.containsKey(a[i])){
                    continue;
                }
                hs.put(a[i],0);
            }
        }
       return hs.size(); 
    }
}
