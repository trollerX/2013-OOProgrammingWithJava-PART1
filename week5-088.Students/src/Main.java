
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.println("name:");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber");
            String number = reader.nextLine();

            list.add(new Student(name, number));

        }

        for (Student prs : list) {
            System.out.println(prs);
        }

        System.out.println("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");
        for (Student prs : list) {
            if (prs.getName().contains(term)) {
                System.out.println(prs);
            }
        }

    }
}
