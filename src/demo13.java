import java.util.*;
public class demo13 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            if(i == 3) {
                System.out.println("Terminating thread");
                t.interrupt();

                if(t.isInterrupted())
                    return;
            }
        }
    }
}
