import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int num = Integer.parseInt(reader.nextLine());
        int sum = num;
//        System.out.println("The num O is " + num);
        int iter = 0;
        int even = 0;
        int odd = 0;
        
        if (num%2==0) {
            even++;
        }
        else {
            odd++;
        }

        
        while (num != -1) {
//            System.out.println("The sum is " + sum);
//            System.out.println("The num A is " + num);
            num = Integer.parseInt(reader.nextLine());
            sum += num;
//            System.out.println("The sum is " + sum);
//            System.out.println("The num B is " + num);
            iter++;
            if (num%2==0 && num != -1) {
            even++;
            }
            else if (num%2 != 0 && num != -1) {
                odd++;
            }
        }
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + (sum+1));
        System.out.println("How many numbers: " + (iter));
        System.out.println("Average: " + ((double)(sum+1)/iter));
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
