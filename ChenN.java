import java.util.Scanner;

public class ChenN {
    public static boolean checkNExist(int nums[]){
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==2*nums[j] || -nums[i]==2*-nums[j]){
                    flag=true;
                }
            }
        }
        return flag;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.println("Enter the Array element");
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(checkNExist(nums));
    }
}
