import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.println("Thread executing main(): " + tName);
        MyThread mt = new MyThread();
        mt.setName("my-super-thread");
        mt.start();
    }
}
class MyThread extends Thread {
    public void run() {
        String tName = Thread.currentThread().getName();
        System.out.println("Thread executing run(): " + tName);
    }
}
