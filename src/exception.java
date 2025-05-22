import java.util.*;
public class exception {
    public static void main(String[] args) {
        System.out.println("Main Started");
        alpha();
        System.out.println("Main ended");
    }

    public static void alpha() {
        System.out.println("Alpha Started");
        try {
            beta();
        } catch (Exception ex) {
            System.out.println("Exception handled by alpha");
        }
        System.out.println("Alpha ended");
    }

    public static void beta() {
        System.out.println("Beta Started");
        int[] a = new int[-5];
        System.out.println("Beta ended");
    }
}
