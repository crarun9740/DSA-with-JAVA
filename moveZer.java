import java.util.Scanner;

public class moveZer {
    public static int[] move(int nums[]){
        int lastzero=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[lastzero];
                nums[lastzero]=nums[i];
                nums[i]=temp;
                lastzero++;
            }
        }
        
        return nums;
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
        System.out.println("zeroes are moved to end");
        move(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
