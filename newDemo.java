public class newDemo {
    public static void main(String[] args) {
        // for(int i=0;i<=3;i++){
        //     for(int j=1;j<9;j++){
        //         if((i % 4==3 && j==1) || (j==2 && i%4==1) || (i%2==0  && j==3) ){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        int n=9;
        if((n & 1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
