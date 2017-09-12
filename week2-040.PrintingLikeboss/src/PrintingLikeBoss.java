public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int printed = 0;
        while (printed < amount) {
            System.out.print(" ");
            printed++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
//        int row = 1;
//        while (row < size) {
            int count = 1;
            while (count <= size) {
                printWhitespaces(size-count);
                printStars(count);
                count++;
            }
//            row++;
            
            
        }
//    }

    public static void xmasTree(int height) {
        // 40.3
        int row = 1;
        int count = 1;
        while (row <= height) {
            printWhitespaces(height-row);
            printStars(count);
            count+=2;
            row++;
        }
        row = 1;
        count = 2;
        while(true){
            
            if (row > 2) {
                break;
            }
            
            printWhitespaces(height-count);
            printStars(3);
            row++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
