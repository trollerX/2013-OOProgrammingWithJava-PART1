
public class Main {

    public static void main(String[] args) {
        // write testcode here
//        Counter c = new Counter(2, true);
//        c.decrease();
//        System.out.println(c.value());
        Counter c = new Counter(2, true);
        c.decrease();
        c.decrease();
        c.decrease();
        System.out.println(c.value());
    }
}
