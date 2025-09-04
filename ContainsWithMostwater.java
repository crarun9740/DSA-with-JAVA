public class ContainsWithMostwater {
    public static int containsWater(int height[]){
        int start=0;
        int end=height.length-1;
        int maxarea=0;
        while(start<=end){
            int h=Math.max(height[start],height[end]);
            int weight=end-start;
            int area=h*weight;
            maxarea=Math.max(maxarea,area);
            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int[] height={1,1,2};
        System.out.println(containsWater(height));
    }
}
