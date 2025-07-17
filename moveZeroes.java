import java.util.*;
public class moveZeroes {
    public static int[] MoveZ(int nums[]){
        int last=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[last];
                nums[last]=nums[i];
                nums[i]=temp;
                last++;
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
        System.out.println();
        System.out.println("After moving zeroes");
        MoveZ(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
