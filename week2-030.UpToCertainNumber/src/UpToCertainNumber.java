
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number?");
        int end = Integer.parseInt(reader.nextLine());
        int num = 1;
        
        while (num <= end) {
            System.out.println(num);
            num +=1;
        }
        
    }
}
