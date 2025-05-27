import java.util.*;
public class demo4 {
    public static void main(String[] args) {
      NumberThread nt = new NumberThread();
      AlphabetThread at = new AlphabetThread();

      nt.start();
      at.start();
    }
}
class NumberThread extends Thread  {
    public void run() {
    try {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    } catch (Exception e) {
        System.out.println("Some exception...");
    }
}
}
class AlphabetThread extends Thread {
    public void run() {
        try {
            for(char i = 'A'; i <= 'E'; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Some exception...");
        }
    }
}
