
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdsDatabase birds = new BirdsDatabase();

        while (true) {
            System.out.print("? ");
            String input = reader.nextLine();
            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
                System.out.print("Name: ");
                Bird bird = new Bird(reader.nextLine());
                System.out.print("Latin name: ");
                bird.addLatinName(reader.nextLine());
                birds.addBird(bird);
            }
            if (input.equals("Observation")) {
                System.out.print("What was observed? ");
                birds.observed(reader.nextLine());
            }
            if(input.equals("Statistics")) {
                birds.printDatabase();
            }
            if(input.equals("Show")){
                System.out.print("What? ");
                birds.show(reader.nextLine());
            }
        }

    }

}


