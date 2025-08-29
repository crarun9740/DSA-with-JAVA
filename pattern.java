public class pattern {
    public static void main(String[] args) {
        int n=5;
        // for(int i=0;i<n;i++){
        // for(int j=0;j<=i;j++){
        //     System.out.print("*");
        // }
        // System.out.println();
        // }

        // for(int i=n;i>=0;i--){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //r<}
        //     System.out.println();
        // }

        // for(int r=0;r<6;r++){
        //     for(int c=0;c<7;c++){
        //         if(c%3!=0 && r==0|| r==1 && c % 3==0 || r-c==2 || r+c==8){
        //             System.out.print(" * ");
        //         }
        //         else{
        //             System.out.print("   ");
        //         }
        //     }
        //     System.out.println();
        // }

        for(int r=0;r<3;r++){
            for(int c=0;c<9;c++){
                if(r+c%4==0 || r==1 || r==3 && r==2 || c % 4==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
