
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int num = Integer.parseInt(reader.nextLine());
        int start = 0;
        int result = 0;
        
        while (start <= num) {
            result = result + (int)Math.pow(2, start);
            start++;
            
        }
        System.out.println("The result is " + result);
    }
}
