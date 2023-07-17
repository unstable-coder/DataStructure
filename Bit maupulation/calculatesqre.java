class square {
    public static int squareofnum(int num){
        if(num==0) return 0;
        if(num<0) num = -num;
        
        int x= num>>1;
        if(num%2!=0) return ((squareofnum(x)<<2) + (x<<2)+1);
          else
            return (squareofnum(x)<<2);
        
    }
    public static void main(String[] args) {
        System.out.println(squareofnum(5));
    }
}
