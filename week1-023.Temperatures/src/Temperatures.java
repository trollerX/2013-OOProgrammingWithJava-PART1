
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        while (true) {
            System.out.println("Type a floating point number:");
            double num = Double.parseDouble(reader.nextLine());
            
            if (num >= -30 && num <= 40) {
                Graph.addNumber(num);
            }
        
//            System.out.println("Continue? Yes/No");
//            String reply = reader.nextLine();
//        
//            if (reply.equals("No")) {
//                break;
//            }
        }
        

        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}