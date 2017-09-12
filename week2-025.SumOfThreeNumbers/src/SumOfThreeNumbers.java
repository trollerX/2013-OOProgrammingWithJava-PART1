
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        int index = 3;
        // Write your program here
        // Use only variables sum and read
        while (index > 0) {
        System.out.println("Write a number:");
        read = Integer.parseInt(reader.nextLine());
        
        sum += read;
        index -= 1;
         }
        
        

        System.out.println("Sum: " + sum);
    }
}
