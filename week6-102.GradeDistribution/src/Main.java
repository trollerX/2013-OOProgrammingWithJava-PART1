
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        double accepted = 0.0;
//        Collections.addAll(scores,34,41,53,36,55,27,43,40);
        Scanner reader = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int score = Integer.parseInt(reader.nextLine());
            if (score == -1) {
                break;
            }
            if (score >= 0 && score <= 60) {
                scores.add(score);
            }
        }
//        System.out.println(scores);
//        System.out.println(printStars(6));

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            int stars = 0;
            for (int score : scores) {
//                System.out.println(score);
                if (grading(score) == i) {
                    stars++;
                    if (grading(score) != 0) {
                        accepted++;
                    }
//                    System.out.println(stars);
                }
            }

            System.out.println(printStars(stars));
        }

        accepted = 100 * accepted / scores.size();
        System.out.println("Acceptance percentage: " + accepted);
    }

    public static String printStars(int n) {
        String stars = "";
//        System.out.println(stars);
        for (int i = 0; i < n; i++) {
//            System.out.println(i);
            stars += "*";
//            System.out.println(stars);
        }
        return stars;
    }

    public static int grading(int points) {
        int grade;
        if (points <= 29) {
            grade = 0;
        } else if (points > 29 & points <= 34) {
            grade = 1;
        } else if (points > 34 & points <= 39) {
            grade = 2;
        } else if (points > 39 & points <= 44) {
            grade = 3;
        } else if (points > 44 & points <= 49) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }

}
