public class ReverseBit {
    public static int reversebit(int n){
       int result=0;
       for(int i=0;i<32;i++){
        result <<= 1;
        result |= (n & 1);
        n>>=1;
       }
       return result;
    }
    public static void main(String[] args) {
        int n=43261596;
        int r=reversebit(n);
       System.out.println(r);
    }
}
