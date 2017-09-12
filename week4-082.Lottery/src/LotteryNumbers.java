
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        for (int length = 7; length > 0; length--) {
            int number = random.nextInt(39) + 1;
            
            if (!containsNumber(number)) {
                this.numbers.add(number);
//                this.numbers.remove(this.numbers.size() - 1);
//                length++;
            }
            else{
                length++;
            }
            

        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (!this.numbers.contains(number)) {
            return false;
        }
        return true;
    }
}
