
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine(); 
        
        int count = 0;
        String vowels = "aeiouAEIOU"; 

        
        for (char ch : word.toCharArray()) {
            if (vowels.indexOf(ch) != -1) { 
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
