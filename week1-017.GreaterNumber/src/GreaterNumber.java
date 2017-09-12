import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number:");
        int num = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number:");
        int num2 = Integer.parseInt(reader.nextLine());
        
        if (num == num2) {
            System.out.println("The numbers are equal.");
         
        }
        else {
            System.out.println("Greater number: " + Math.max(num, num2));
        }

    }
}
