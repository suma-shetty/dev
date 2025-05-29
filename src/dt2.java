import java.util.*;
public class dt2 {
    public static void main(String[] args) {
       ReaderThread rt = new ReaderThread();
       rt.start();
    }
}
class ReaderThread extends Thread {
    Library lib = new Library();
    public void run() {
        try {
            lib.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Library {
    String book1 = "Java";
    String book2 = "SQL";
    String book3 = "React";

    public void read() throws InterruptedException {
        synchronized (book1) {
            System.out.println("Reader has occupied " + book1);
            Thread.sleep(1000);
            synchronized (book2) {
                System.out.println("Reader has occupied " + book2);
                Thread.sleep(1000);
                synchronized (book3) {
                    System.out.println("Reader has occupied " + book3);
                    Thread.sleep(1000);
                }
                System.out.println("Reader has released" + book3);
            }
            System.out.println("Reader has released" + book2);
        }
        System.out.println("Reader has released" + book1);
    }
}
