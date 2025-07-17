import java.util.*;
public class CheckNandDouble {
    public static int[] MoveZeroes(int nums[]){
        int start=0;
        int end=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[start]==0 || nums[end]!=0){
                int temp=nums[end];
                nums[end]=nums[start];
                nums[start]=temp;
                start++;
                end--;
            }
            if(nums[end]== 0 || nums[start]!=0){
                end--;
                start++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("enter the array elements: ");
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Original Array is : ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("After moving zeroes");
        MoveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
