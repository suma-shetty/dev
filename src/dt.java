import jdk.jfr.Experimental;

import java.util.*;
public class dt {
    public static void main(String[] args) {
        MajorThread pt = new MajorThread();
        SupportiveThread1 tt = new SupportiveThread1();
        tt.setDaemon(true);
        tt.setPriority(1);
        SupportiveThread2 dt = new SupportiveThread2();
        dt.setDaemon(true);
        dt.setPriority(1);
        pt.start();
        tt.start();
        dt.start();
    }
}
class MajorThread extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Major activity is finished");
                Thread.sleep(1000);
            }
        } catch(Exception e) {
            System.out.println("Problem occured");
        }
    }
}
class SupportiveThread1 extends Thread {
    public void run() {
        try {
            for(;;) {
                System.out.println("Supportive 1 activity is finished");
                Thread.sleep(1000);
            }
        } catch(Exception e) {
            System.out.println("Problem occured");
        }
    }
}
class SupportiveThread2 extends Thread {
    public void run() {
        try {
            for(;;) {
                System.out.println("Supportive 2 activity is finished");
                Thread.sleep(1000);
            }
        } catch(Exception e) {
            System.out.println("Problem occured");
        }
    }
}
