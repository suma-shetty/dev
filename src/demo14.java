import java.util.*;
public class demo14 {
    public static void main(String[] args) {
        VisitDoctor task = new VisitDoctor();
        Thread t1 = new Thread(task);
        t1.setName("Batsman");
        Thread t2 = new Thread(task);
        t2.setName("Batsman");
        t1.start();
        t2.start();

    }
}
class VisitDoctor implements Runnable {
    synchronized public void run() {
        try {
            String tname = Thread.currentThread().getName();
            System.out.println(tname + " has entered clinic");
            Thread.sleep(2000);

            System.out.println(tname + " is getting treatment");
            Thread.sleep(2000);

            System.out.println(tname + " has exited clinic");
            Thread.sleep(2000);
        }
        catch(Exception e) {
            //...
        }
    }
}
